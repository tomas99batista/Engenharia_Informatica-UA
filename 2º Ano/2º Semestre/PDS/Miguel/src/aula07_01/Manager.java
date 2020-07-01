package aula07_01;

import java.util.Date;

public class Manager extends EmployeeDecorator {
    public Manager(EmployeeInterface employee) {
        super(employee);
    }

    @Override
    public void start(Date date) {
        this.employee.start(date);
    }

    @Override
    public void terminate(Date date) {
        this.employee.terminate(date);

    }

    @Override
    public void work() {
        this.employee.work();
        System.out.print(", Manager");
    }

    public void manage() {
        System.out.printf("-- Managing...%n");
    }

}
