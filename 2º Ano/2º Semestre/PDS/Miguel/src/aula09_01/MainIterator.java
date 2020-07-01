package aula09_01;

import java.util.Iterator;
import java.util.ListIterator;

public class MainIterator {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.addElem(3);
        print("added " + vec.getElem(0));
        vec.removeElem(3);
        print("removed 3");
        print("added 25");
        vec.addElem(25);
        for (int i = 0; i < 10; i++) {
            print("added " + i);
            vec.addElem(i);
        }
        print("Iterator");
        Iterator<Integer> iterator = vec.iterator();

        while (iterator.hasNext()) {
            Integer item = iterator.next();
            print(item);
        }

        print("List iterator - next");
        ListIterator<Integer> listIt = vec.listIterator();
        while (listIt.hasNext()) {
            Integer item = listIt.next();
            print(item);
        }

        print("List iterator - previous");
        ListIterator<Integer> listItPrev = vec.listIterator(vec.totalElem());
        while (listItPrev.hasPrevious()) {
            Integer item = listItPrev.previous();
            print(item);
        }

        print("List iterator - Alternating");
        int                   k               = 4;
        ListIterator<Integer> listItAlternate = vec.listIterator();
        while (k > 0) {
            Integer item = listItAlternate.next();
            print("Next item: " + item);
            item = listItAlternate.previous();
            print("Previous item " + item);
            k--;
        }

    }

    private static void print(Integer s) {
        System.out.println(s);
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
