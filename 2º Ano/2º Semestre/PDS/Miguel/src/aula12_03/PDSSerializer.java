package aula12_03;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class PDSSerializer {
    /**
     * Mesma coisa que chamar {@link #fromObject(Object o, boolean true, String
     * null)}
     *
     * @param o o Objecto a serializar em JSON
     *
     * @return a string em JSON, <i>"beautify"-ed</i>
     */
    public static String fromObject(Object o) {
        return fromObject(o, true, null);
    }

    /**
     * Serializa o objeto numa String JSON, recursivamente. <br> Suporta
     * serialização de campos públicos, privados e protected. Se
     * <b>protected</b> ou <b>privados</b>, é necessário haver um getter.<br>
     * Se
     * públicos, não há problema.<br> De momento, apenas suporta serialização de
     * <b>qualquer tipo primitivo do Java</b>, ou objetos cujos campos sejam desses
     * tipos (incluindo arrays). Também suporta Listas desses tipos ou objetos
     * derivados.<br> <b>Não suporta mapas</b> (pelo menos não existe nenhuma
     * garantia que não ocorrerá um erro ou que os resultados não serão o
     * esperado).
     *
     * @param o          o Objeto a serializar
     * @param prettify   se true, então a string será <i>"beautify"-ed</i>,
     *                   tornando o código legível. <br> Se falso, o argumento
     *                   <code>baseIndent</code> é ignorado.
     * @param baseIndent indentação base. Ignorado se
     *
     * @return a string em JSON
     *
     * @see #getFieldFromMethod(Method, Object) getFieldFromMethod(Method,
     * Object)
     */
    public static String fromObject(Object o, boolean prettify, String baseIndent) {
        // if we aren't told to make it pretty or baseIndent isn't provided,
        // then we just default to no indentation making sure it doesn't error out
        if (!prettify || baseIndent == null) {
            baseIndent = "";
        }
        StringBuilder sb = new StringBuilder("{");
        if (prettify) {
            sb.append("\n");
        }
        Class<?>                cl      = o.getClass();
        HashMap<String, Method> getters = new HashMap<>();
        // First we find all the getters
        for (Method m : cl.getMethods()) {
            String methodName = m.getName().toLowerCase();
            if (methodName.startsWith("get")) {
                getters.put(methodName, m);
            }
        }

        for (Field field : cl.getDeclaredFields()) {
            // If we
            if (prettify) {
                sb.append(baseIndent);
                sb.append("\t");
            }
            sb.append(toJSON(field.getName()));
            int modifiers = field.getModifiers();
            // If this field is not static (we're storing objects' instances)
            // and if it's not abstract
            if (!Modifier.isStatic(modifiers)
                && !Modifier.isAbstract(modifiers)) {
                // if it's private or protected, we need to use the getter
                if (Modifier.isPrivate(modifiers) || Modifier.isProtected(
                        modifiers)) {
                    Method fieldGetter = getters.getOrDefault("get"
                                                              + field.getName(),
                                                              null);
                    // if a getter doesn't exist for this field, we ignore it
                    if (fieldGetter != null) {
                        Class<?> returnType = fieldGetter.getReturnType();
                        // we first try to get the value
                        Object val = getFieldFromMethod(fieldGetter, o);
                        // if no error occurred

                        if (prettify) {
                            sb.append(" : ");
                        } else {
                            sb.append(":");
                        }

                        if (val == null) {
                            sb.append("null");
                        } else {
                            // If it's primitive, we need to handle it slightly different (mainly because of java's numeric types)
                            if (returnType.isPrimitive()) {
                                sb.append(processPrimitive(val,
                                                           returnType,
                                                           prettify,
                                                           baseIndent));
                            } else {
                                sb.append(processNonPrimitive(val,
                                                              returnType,
                                                              prettify,
                                                              baseIndent));
                            }
                        }
                        // and setup for the next
                        sb.append(",");
                        if (prettify) {
                            sb.append("\n");
                        }
                    }
                }
                //otherwise, if it's public, we can just access it (or try to
                else if (Modifier.isPublic(modifiers)) {
                    Object   val       = getField(field, o);
                    Class<?> fieldType = field.getType();
                    if (prettify) {
                        sb.append(" : ");
                    } else {
                        sb.append(":");
                    }
                    if (val == null) {
                        sb.append("null");
                    } else {
                        // Since field values get boxed, we don't need to care about primitive types
                        sb.append(processNonPrimitive(val,
                                                      fieldType,
                                                      prettify,
                                                      baseIndent));
                    }
                    // and setup for the next
                    sb.append(",");
                    if (prettify) {
                        sb.append("\n");
                    }
                }
            }
        }
        // we remove the last comma made since it's really unnecessary
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append(baseIndent);
        sb.append("}");

        return sb.toString();
    }

    private static String processNonPrimitive(Object val, Class<?> returnType, boolean prettify, String baseIndent) {

        if (returnType.equals(Byte.class)) {
            return toJSON((Byte) val);
        } else if (returnType.equals(Byte[].class)) {
            return toJSON((Byte[]) val);
        } else if (returnType.equals(Short.class)) {
            return toJSON((Short) val);
        } else if (returnType.equals(Short[].class)) {
            return toJSON((Short[]) val);
        } else if (returnType.equals(Integer.class)) {
            return toJSON((Integer) val);
        } else if (returnType.equals(Integer[].class)) {
            return toJSON((Integer[]) val);
        } else if (returnType.equals(Long.class)) {
            return toJSON((Long) val);
        } else if (returnType.equals(Long[].class)) {
            return toJSON((Long[]) val);
        } else if (returnType.equals(float.class)) {
            return toJSON((Float) val);
        } else if (returnType.equals(Float[].class)) {
            return toJSON((Float[]) val);
        } else if (returnType.equals(Double.class)) {
            return toJSON((Double) val);
        } else if (returnType.equals(Double[].class)) {
            return toJSON((Double[]) val);
        } else if (returnType.equals(Character.class)) {
            return toJSON((Character) val);
        } else if (returnType.equals(Character[].class)) {
            return toJSON((Character[]) val);
        } else if (returnType.equals(Boolean.class)) {
            return toJSON((Boolean) val);
        } else if (returnType.equals(Boolean[].class)) {
            return toJSON((Boolean[]) val);
        } else if (returnType.equals(String.class)) {
            return toJSON(((String) val));
        } else if (returnType.equals(String[].class)) {
            return toJSON(((String[]) val));
        } else if (returnType.equals(List.class)) {
            return toJSON(((List) val).toArray());
        }
        // Everything else we just call recursively
        else {
            return fromObject(val, prettify, baseIndent + "\t");
        }
    }

    private static String processPrimitive(Object val, Class<?> returnType, boolean prettify, String baseIndent) {
        if (returnType.equals(byte.class)) {
            return toJSON((Byte) val);
        } else if (returnType.equals(byte[].class)) {
            return toJSON((Byte[]) val);
        } else if (returnType.equals(short.class)) {
            return toJSON((Short) val);
        } else if (returnType.equals(short[].class)) {
            return toJSON((Short[]) val);
        } else if (returnType.equals(int.class)) {
            return toJSON((Integer) val);
        } else if (returnType.equals(int[].class)) {
            return toJSON((Integer[]) val);
        } else if (returnType.equals(long.class)) {
            return toJSON((Long) val);
        } else if (returnType.equals(long[].class)) {
            return toJSON((Long[]) val);
        } else if (returnType.equals(float.class)) {
            return toJSON((Float) val);
        } else if (returnType.equals(float[].class)) {
            return toJSON((Float[]) val);
        } else if (returnType.equals(double.class)) {
            return toJSON((Double) val);
        } else if (returnType.equals(double[].class)) {
            return toJSON((Double[]) val);
        } else if (returnType.equals(char.class)) {
            return toJSON((Character) val);
        } else if (returnType.equals(char[].class)) {
            return toJSON((Character[]) val);
        } else if (returnType.equals(boolean.class)) {
            return toJSON((Boolean) val);
        } else if (returnType.equals(boolean[].class)) {
            return toJSON((Boolean[]) val);
        } else {
            throw new UnsupportedOperationException(
                    "ERROR! Impossible type passed as primitive!");
        }
    }

    private static String toJSON(Boolean val) {
        return val.toString();
    }

    private static String toJSON(Character val) {
        return "\"" + val.toString() + "\"";
    }

    public static String toJSON(String string) {
        return "\"" + string + "\"";

    }

    public static <T> String toJSON(T[] array) {
        // if this is an array of strings, we can't use the shorcut
        if (array.getClass().equals(String[].class)) {
            StringBuilder finalString = new StringBuilder();
            finalString.append("[");
            for (String s : (String[]) array) {
                finalString.append("\"");
                finalString.append(s);
                finalString.append("\"");
                // adding the comma to split and a space
                finalString.append(", ");
            }
            // removing the last comma and space
            finalString.setLength(finalString.length() - 2);
            finalString.append("]");
            return finalString.toString();
        } else {
            return Arrays.asList(array).toString();

        }
    }

    public static String toJSON(Number number) {
        return number.toString();
    }

    /**
     * Helper method for getting the value of a field. Returns null if an error
     * occurs or if the field is null
     *
     * @param field the field to get the value for
     * @param o     the object from where to get the field value
     *
     * @return null if an error * occurs or if the field is null
     */
    private static Object getField(Field field, Object o) {
        try {
            return field.get(o);
        } catch (IllegalAccessException e) {
            System.err.println("Unable to access field "
                               + field.getName());
        }
        return null;
    }

    /**
     * Helper method for getting the value of a field, assuming it has a getter
     * (in the format of <code>get&lt;FieldName&gt;</code>). <br>Returns null if
     * an error occurs or if the field is null
     *
     * @param getter the getter method for the field
     * @param o      the object from where to call the method
     *
     * @return null if an error occurs
     */
    private static Object getFieldFromMethod(Method getter, Object o) {
        try {
            return getter.invoke(o);
        } catch (IllegalAccessException e) {
            System.err.println("Unable to access method "
                               + getter.getName());
        } catch (InvocationTargetException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
