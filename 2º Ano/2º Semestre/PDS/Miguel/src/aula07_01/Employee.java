package aula07_01;

import java.util.Date;

public class Employee implements EmployeeInterface {
    private String name;
    private double salary;
    private Date   startDate;
    private Date   endDate;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void start(Date date) {
        this.startDate = date;
        System.out.printf("%s started working in %s%n", this.getClass().getSimpleName(), date);

    }

    @Override
    public void terminate(Date date) {
        this.endDate = date;
        System.out.printf("%s stops working at %s%n", this.getClass().getSimpleName(), date);
    }

    @Override
    public void work() {
        System.out.printf("%n%s is working. He is a %s", name, this.getClass().getSimpleName());

    }
}
