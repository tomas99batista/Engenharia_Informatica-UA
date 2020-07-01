package aula08_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Medis implements Insurance {
    private List<Person>         personList;
    private Map<Person, Integer> plansMap;

    private static enum InsurancePlans {
        INDIVIDUAL(1),
        GROUP(2);
        private int id;

        InsurancePlans(int id) {
            this.id = id;
        }
    }

    public Medis() {
        personList = new ArrayList<>();
        plansMap = new HashMap<>();
    }

    @Override
    public boolean regist(Person p) {
        if (!isRegisted(p)) {
            return personList.add(p);
        }
        return false;
    }

    @Override
    public boolean isRegisted(Person p) {
        return personList.contains(p);
    }

    @Override
    public void setPlanFor(Person p, int planID) {
        if (personList.contains(p)) {
            plansMap.put(p, planID);
        }
    }
}
