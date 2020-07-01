package aula07_03;

public abstract class Componente {
    protected String name;
    protected static StringBuilder indent;
    public Componente(String name){
        this.name = name;
        indent = new StringBuilder();
    }
    public void draw(){
        System.out.printf(name +"%n");
    }
}
