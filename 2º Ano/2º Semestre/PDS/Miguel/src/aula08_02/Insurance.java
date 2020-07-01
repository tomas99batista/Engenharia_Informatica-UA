package aula08_02;

public interface Insurance {
    boolean regist(Person p);

    boolean isRegisted(Person p);

    void setPlanFor(Person p, int planID);
}
