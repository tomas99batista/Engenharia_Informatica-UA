package aula11_01;

import java.util.Arrays;
import java.util.Comparator;

public class JavaSort implements TelemovelSorter {
    @Override
    public void sort(Telemovel[] telemoveis, Comparator<Telemovel> comparator) {
        Arrays.sort(telemoveis, comparator);
    }
}
