package aula09_01;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Vector<T> {
    private T[] vec;
    private int nElem;
    private final static int ALLOC  = 50;
    private              int dimVec = ALLOC;

    private class VectorIterator implements Iterator<T> {
        private int index = 0;

        /**
         * {@inheritDoc
         */
        @Override
        public boolean hasNext() {
            return index != nElem;
        }

        /**
         * {@inheritDoc
         */
        @Override
        public T next() {
            if (hasNext()) {
                T elem = Vector.this.vec[index];
                index++;
                return elem;
            }
            throw new IndexOutOfBoundsException("only " + nElem + " elements");
        }
    }

    private class VectorListIterator implements ListIterator<T> {

        private int lastIndex;
        private int index;


        public VectorListIterator(int index) {
            this.index = index;
            lastIndex = index-1;
        }

        /**
         * {@inheritDoc
         */
        @Override
        public boolean hasNext() {
            return index != nElem;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public T next() {
            if (hasNext()) {
                T elem = Vector.this.vec[index];
                lastIndex = index;
                index++;
                return elem;
            }
            throw new IndexOutOfBoundsException("only " + nElem + " elements");
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean hasPrevious() {
            return lastIndex != -1;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public T previous() throws NoSuchElementException {
            if (hasPrevious()) {
                T elem = Vector.this.vec[lastIndex];
                index = lastIndex;
                lastIndex--;
                return elem;
            }
            throw new NoSuchElementException();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public int nextIndex() {
            if (hasNext()) {
                return index;
            }
            return nElem;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public int previousIndex() {
            if (hasPrevious()) {
                return lastIndex;
            }
            return -1;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void remove() {

        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void set(T t) {

        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void add(T t) {

        }
    }

    @SuppressWarnings("unchecked")
    public Vector() {
        vec = (T[]) new Object[dimVec];
        nElem = 0;
    }

    public boolean addElem(T elem) {
        if (elem == null) {
            return false;
        }
        ensureSpace();
        vec[nElem++] = elem;
        return true;
    }

    private void ensureSpace() {
        if (nElem >= dimVec) {
            dimVec += ALLOC;
            @SuppressWarnings("unchecked")
            T[] newArray = (T[]) new Object[dimVec];
            System.arraycopy(vec, 0, newArray, 0, nElem);
            vec = newArray;
        }
    }

    public boolean removeElem(T elem) {
        for (int i = 0; i < nElem; i++) {
            if (vec[i].equals(elem)) {
                if (nElem - i - 1 > 0) // not last element
                {
                    System.arraycopy(vec, i + 1, vec, i, nElem - i - 1);
                }
                vec[--nElem] = null; // libertar último objecto para o GC
                return true;
            }
        }
        return false;
    }

    public int totalElem() {
        return nElem;
    }

    public T getElem(int i) {
        return (T) vec[i];
    }

    public Iterator<T> iterator() {
        return new VectorIterator();
    }

    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public ListIterator<T> listIterator(int index) {
        if (index >= 0) {
            return new VectorListIterator(index);
        }
        throw new ArrayIndexOutOfBoundsException("Error! Index cannot be negative");
    }

}