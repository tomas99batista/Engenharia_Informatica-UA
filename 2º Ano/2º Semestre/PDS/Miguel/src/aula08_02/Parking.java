package aula08_02;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private List<Person> allowed;

    public Parking() {
        allowed = new ArrayList<>();
    }

    public void allow(Person p) {
        if (!allowed.contains(p)) {
            allowed.add(p);
        }
    }
}
