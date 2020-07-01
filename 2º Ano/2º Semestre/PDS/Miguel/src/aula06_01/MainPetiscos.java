package aula06_01;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MainPetiscos {
    static int MAX_EMPS = 10;

    public static void main(String[] args) {
        // Nota, os número são gerados aleatóriamente, por isso é possivel haver IDs iguais
        // No entanto, como nós garantimos que no código de Registos só é adicionado se já não existir, então não há problema

        int[] nums = randomIDs();
        Registos reg = new Registos();
        // Inserção
        for (int i = 0; i < MAX_EMPS; i++) {
            reg.insere(new Empregado("Alfredo", "Antonio", nums[i], nums[i] * (MAX_EMPS + 1)));
        }
        List<Empregado> emps = reg.listaDeEmpregados();
        System.out.printf("Após inserção:\nNúmero de empregados: %d\n", emps.size());

        // Remove
        reg.remove(nums[MAX_EMPS - 1]);
        emps = reg.listaDeEmpregados();
        System.out.printf("Após remove:\nNúmero de empregados: %d\n", emps.size());

        // Isempregado
        for (int num : nums) {
            System.out.printf("%d é empregado? %b\n", num, reg.isEmpregado(num));
        }
    }

    public static int[] randomIDs() {
        int maxNumber = 1000000;
        return ThreadLocalRandom.current().ints(MAX_EMPS, 0, 1000000).toArray();
    }
}
