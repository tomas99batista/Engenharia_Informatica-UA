package aula11_01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainStrategy {
    public static void main(String[] args) {

        List<Telemovel> originalTelemoveis = Arrays.asList(
                new Telemovel(359.99, 8, 2.9, 3.0),
                new Telemovel(299.99, 4, 3.4, 12.0),
                new Telemovel(159.99, 2, 5.0, 15.0),
                new Telemovel(499.99, 6, 3.5, 7.0),
                new Telemovel(659.99, 6, 3.5, 8.0),
                new Telemovel(759.99, 8, 1.0, 5.0),
                new Telemovel(859.99, 9, 2.0, 10.0),
                new Telemovel(359.99, 1, 3.0, 2.0),
                new Telemovel(359.99, 2, 3.7, 5.0),
                new Telemovel(229.99, 3, 1.5, 8.0),
                new Telemovel(399.99, 4, 5.7, 4.0),
                new Telemovel(259.99, 5, 2.7, 15.0),
                new Telemovel(359.99, 6, 9.0, 3.0),
                new Telemovel(319.99, 3, 2.0, 5.0),
                new Telemovel(159.99, 8, 3.4, 5.0),
                new Telemovel(229.99, 1, 3.5, 9.0)
                                                          );

        Comparator<Telemovel> sortByCpuSpeed = (t1, t2) -> {
            if (t1.getCpuSpeed() > t2.getCpuSpeed()) {
                return 1;
            } else if (t1.getCpuSpeed() < t2.getCpuSpeed()) {
                return -1;
            }
            return 0;
        };
        // Outras possíveis opções de sort
        Comparator<Telemovel> sortByPrice = (t1, t2) -> {
            if (t1.getPrice() > t2.getPrice()) {
                return 1;
            } else if (t1.getPrice() < t2.getPrice()) {
                return -1;
            }
            return 0;
        };

        Comparator<Telemovel> sortByCameraRes = (t1, t2) -> {
            if (t1.getCamera_res() > t2.getCamera_res()) {
                return 1;
            } else if (t1.getCamera_res() < t2.getCamera_res()) {
                return -1;
            }
            return 0;
        };
        Comparator<Telemovel> sortByCpuCores = (t1, t2) -> {
            if (t1.getCpuCores() > t2.getCpuCores()) {
                return 1;
            } else if (t1.getCpuCores() < t2.getCpuCores()) {
                return -1;
            }
            return 0;
        };

        List<TelemovelSorter> algoritmos =
                Arrays.asList(new BubbleSort(),
                              new JavaSort(),
                              new InsertionSort());
        for (TelemovelSorter sorter : algoritmos) {
            Telemovel[] telemoveis = (Telemovel[]) originalTelemoveis.toArray();
            System.out.println();
            System.out.println("Antes de Ordenar por Velocidade de CPU (com "
                               + sorter
                                         .getClass()
                                         .getSimpleName()
                               + ")");
            Arrays.asList(telemoveis).forEach(System.out::println);
            // Sorting
            sorter.sort(telemoveis, sortByCpuSpeed);
            System.out.println();
            System.out.println("Depois de Ordenar por Velocidade de CPU (com "
                               + sorter
                                         .getClass()
                                         .getSimpleName()
                               + ")");
            Arrays.asList(telemoveis).forEach(System.out::println);
        }
    }
}
