package aula08_02;

import aula08_01_a.BankAccount;
import aula08_01_a.BankAccountImpl;
import aula08_01_a.BankAccountProxy;

import java.util.Objects;

public class Person {
    private static Long TOTAL_PERSONS = 1L;
    // our identification number
    private Long        id;
    private String      name;
    private BankAccount bankAccount;

    public Person(String n) {
        this.id = TOTAL_PERSONS;
        TOTAL_PERSONS++;
        name = n;
        bankAccount = new BankAccountProxy(new BankAccountImpl("PeDeMeia", 0));
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return this.id;
    }

    public BankAccount getBankAccount() {
        return bankAccount;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }


}