package aula08_02;

public class CompanyFacade {
    private Company   company;
    private Insurance insurance;
    private Parking   parkingLot;

    public CompanyFacade(Company c, Insurance i, Parking p) {
        company = c;
        insurance = i;
        parkingLot = p;
    }

    public void admitEmployee(Person person, double salary) {
        Employee newEmployee = new Employee(person, salary, company.generateNewCard());
        company.admitEmployee(newEmployee);
        insurance.regist(person);
        SocialSecurity.regist(person);
        if (salary > company.getAverageSalary()) {
            parkingLot.allow(person);
        }

    }
}
