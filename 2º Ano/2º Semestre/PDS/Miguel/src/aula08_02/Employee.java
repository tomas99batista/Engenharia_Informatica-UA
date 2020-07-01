package aula08_02;

public class Employee {
    private Person person;
    private Card   card;
    private double salary;

    public Employee(Person p, double s, Card card) {
        person = p;
        salary = s;
        this.card = card;
    }

    public void deposit(double amount) {
        person.getBankAccount().deposit(amount);
    }

    public double getSalary() {
        return salary;
    }

    public Card getEmployeeCard() {
        return this.card;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return person.equals(o);
    }
}