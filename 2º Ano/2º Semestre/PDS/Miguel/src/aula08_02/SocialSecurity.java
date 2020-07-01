package aula08_02;

import java.util.ArrayList;
import java.util.List;

public final class SocialSecurity {
    private static final List<Person> personsRegistered = new ArrayList<>();

    public static boolean regist(Person p) {
        return personsRegistered.add(p);
    }

    public static boolean isRegistered(Person p) {
        return personsRegistered.contains(p);
    }

}
