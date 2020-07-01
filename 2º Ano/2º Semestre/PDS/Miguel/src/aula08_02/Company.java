package aula08_02;

import java.util.*;

public class Company {
    public static User user;
    private static long                TOTAL_EMPLOYEES = 1;
    private        double              AVERAGE_SALARY  = 700;
    private        Map<Card, Employee> cardEmployeeMap = new HashMap<>();
    private        List<Employee>      emps            = new ArrayList<>();

    public void admitEmployee(Employee newEmployee) {
        emps.add(newEmployee);
        cardEmployeeMap.put(newEmployee.getEmployeeCard(), newEmployee);
    }

    public double getAverageSalary() {
        return AVERAGE_SALARY;
    }

    public void paySalaries(int month) {
        for (Employee e : emps) {
            e.deposit(e.getSalary());
        }
    }

    public Employee getEmployee(Card card) {
        return cardEmployeeMap.getOrDefault(card, null);
    }

    public Card generateNewCard() {
        Card newCard = new Card(TOTAL_EMPLOYEES);
        TOTAL_EMPLOYEES++;
        return newCard;
    }

    public List<Employee> employees() {
        return Collections.unmodifiableList(emps);
    }


}