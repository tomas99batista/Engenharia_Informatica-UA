package aula11_01;

import java.util.Comparator;

public class InsertionSort implements TelemovelSorter {
    @Override
    public void sort(Telemovel[] telemoveis, Comparator<Telemovel> comparator) {
        int       j;
        Telemovel temp;
        for (int i = 1; i < telemoveis.length; i++) {
            j = i - 1;
            while (j >= 0
                   && comparator.compare(telemoveis[j], telemoveis[i]) > 0) {
                temp = telemoveis[i];
                telemoveis[i] = telemoveis[j];
                telemoveis[j] = temp;
                i = j;
                j--;
            }
        }
    }
}
