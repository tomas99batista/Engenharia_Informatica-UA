package aula08_02;

import java.util.List;

public class MainCompanyFacade {
    public static void main(String[] args) {
        Person[] persons = {new Person("Maria Silva"),
                new Person("Manuel Pereira"),
                new Person("Aurora Machado"),
                new Person("Augusto Lima")};
        Company shark = new Company();
        Company.user = User.COMPANY;
        Insurance     medis       = new Medis();
        Parking       parking     = new Parking();
        CompanyFacade sharkFacade = new CompanyFacade(shark, medis, parking);

        sharkFacade.admitEmployee(persons[0], 1000);
        sharkFacade.admitEmployee(persons[1], 900);
        sharkFacade.admitEmployee(persons[2], 1200);
        sharkFacade.admitEmployee(persons[3], 1100);
        List<Employee> sharkEmps = shark.employees();
        for (Employee e : sharkEmps) {
            System.out.println(e.getSalary());
            System.out.printf("Card number %d for employee %s\n", e.getEmployeeCard().getCARD_ID(), e.getPerson());
            System.out.println("Is registed in Social security? " + SocialSecurity.isRegistered(e.getPerson()));
        }
        shark.paySalaries(1);
    }
}