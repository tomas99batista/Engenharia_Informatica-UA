package aula08_01_b;

public class Employee {
    private Person person;
    private double salary;

    public Employee(Person p, double s) {
        person = p;
        salary = s;
    }

    public String getName() {
        return person.getName();
    }

    public void deposit(double amount) {
        person.getBankAccount().deposit(amount);
    }

    public double getSalary() {
        return salary;
    }
}