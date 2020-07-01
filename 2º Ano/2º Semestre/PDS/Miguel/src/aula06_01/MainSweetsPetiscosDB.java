package aula06_01;

import java.util.concurrent.ThreadLocalRandom;

public class MainSweetsPetiscosDB {
    static int MAX_EMPS = 5;

    public static void main(String[] args) {
        // Inicializações
        int[]    nums = randomIDs();
        Registos reg  = new Registos();

        System.out.println("Passo 0 - Vamos inicializar as bases de dados \"antigas\".\n"
                + "Registos irá conter Empregados com o nome Alfredo António,"
                + "\nenquanto que Database irá conter Empregados com o nome João.");

        for (int i = 0; i < MAX_EMPS; i++) {
            reg.insere(new Empregado("Alfredo", "Antonio", nums[i], nums[i] * (MAX_EMPS + 1)));
        }
        nums = randomIDs();
        Database db = new Database();
        for (int i = 0; i < MAX_EMPS; i++) {
            db.addEmployee(new Employee("João", nums[i], nums[i] * (MAX_EMPS + 1)));
        }

        System.out.println("Passo 1 - Vamos inicializar a nossa base de dados apenas com a Database antiga (e não Registos).");

        SweetsPetiscosDB newDB = new SweetsPetiscosDB(db);

        System.out.println("Passo 2 - Imprimir antes de adicionar\n");
        System.out.println(newDB.printAllPersonnel());

        System.out.println("Passo 3 - Vamos adicionar elementos à nossa nova base de dados.\nJosé Alves vão ser os Empregados, Diogo os Employees.");

        for (int i = 0; i < MAX_EMPS; i++) {
            newDB.addEmployee(new Empregado("José", "Alves", nums[i] * (i + 1), nums[i] * (MAX_EMPS + 1)));
            newDB.addEmployee(new Employee("Diogo", nums[i] * (i + 1), nums[i] * (MAX_EMPS + 2)));
        }

        System.out.println("Passo 4 - Imprimir depois de adicionar");
        System.out.println(newDB.printAllPersonnel());

        System.out.println("Passo 5 - Agora vamos inicializar a nossa base de dados tanto com a antiga Database e a antiga Registos");
        newDB = new SweetsPetiscosDB(db, reg);
        System.out.println("Passo 6 - Imprimir antes de adicionar");
        System.out.println(newDB.printAllPersonnel());

        System.out.println("Passo 7 - Vamos adicionar elementos à nossa nova base de dados.\nJosé Alves vão ser os Empregados, Diogo os Employees.");
        for (int i = 0; i < MAX_EMPS; i++) {
            newDB.addEmployee(new Empregado("José", "Alves", nums[i] * (i + 1), nums[i] * (MAX_EMPS + 1)));
            newDB.addEmployee(new Employee("Diogo", nums[i] * (i + 1), nums[i] * (MAX_EMPS + 2)));
        }

        System.out.println("Passo 8 - Imprimir depois de adicionar");
        System.out.println(newDB.printAllPersonnel());
    }


    public static int[] randomIDs() {
        int maxNumber = 1000000;
        return ThreadLocalRandom.current().ints(MAX_EMPS, 0, 1000000).toArray();
    }
}
