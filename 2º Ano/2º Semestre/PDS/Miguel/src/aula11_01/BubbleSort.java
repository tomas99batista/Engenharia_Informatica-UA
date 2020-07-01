package aula11_01;

import java.util.Comparator;

public class BubbleSort implements TelemovelSorter {
    @Override
    public void sort(Telemovel[] telemoveis, Comparator<Telemovel> comparator) {
        Telemovel temp;
        for (int i = 0; i < telemoveis.length; i++) {
            for (int j = 1; j < telemoveis.length - i; j++) {
                if (comparator.compare(telemoveis[j - 1], telemoveis[j]) > 0) {
                    temp = telemoveis[j - 1];
                    telemoveis[j - 1] = telemoveis[j];
                    telemoveis[j] = temp;
                }
            }
        }
    }
}
