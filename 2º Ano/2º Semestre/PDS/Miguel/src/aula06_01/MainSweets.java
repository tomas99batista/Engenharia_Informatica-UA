package aula06_01;

import java.util.concurrent.ThreadLocalRandom;

public class MainSweets {
    static int MAX_EMPS = 10;


    public static void main(String[] args) {
        // Nota, os número são gerados aleatóriamente, por isso é possivel haver IDs iguais
        // No entanto, como nós garantimos que no código de Registos só é adicionado se já não existir, então não há problema

        int[] nums = randomIDs();
        Database db = new Database();
        // Inserção
        for (int i = 0; i < MAX_EMPS; i++) {

            System.out.printf("Add of %d was successful: %b\n", nums[i], db.addEmployee(
                                                                                        new Employee(
                                                                                                "Alfredo",
                                                                                                    nums[i],
                                                                                                nums[i] * (MAX_EMPS + 1)))
            );

        }
        // adding again
           System.out.printf("Add of %d was successful: %b\n", nums[MAX_EMPS-1], db.addEmployee(
                                                                                        new Employee(
                                                                                                "Alfredo",
                                                                                                    nums[MAX_EMPS-1],
                                                                                                nums[MAX_EMPS-1] * (MAX_EMPS + 1)))
            );

        Employee[] emps = db.getAllEmployees();
        System.out.printf("After add:\nNumber of Employees: %d\n", emps.length);


        emps = db.getAllEmployees();
        System.out.printf("After delete:\nNumber of Employees: %d\n", emps.length);

    }

    public static int[] randomIDs() {
        int maxNumber = 1000000;
        return ThreadLocalRandom.current().ints(MAX_EMPS, 0, 1000000).toArray();
    }

}
