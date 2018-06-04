package org.academiadecodigo.bootcamp;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Integer range iterator
 */
public class Range implements Iterable<Integer> {

    private int min;
    private int max;
    private boolean reverse;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void reversed() {
        reverse = true;
    }

    public void forward() {
        reverse = false;
    }

    @Override
    public Iterator<Integer> iterator() {
        if (reverse) {
            return new ReverseRangeIterator();

        }
        return new FwdRangeIterator();
    }

    private class FwdRangeIterator implements Iterator<Integer> {

        private int current;

        public FwdRangeIterator() {
            current = min - 1;
        }

        @Override
        public boolean hasNext() {
            return current < max;
        }

        @Override
        public Integer next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            current++;
            return current;
        }

    }

    private class ReverseRangeIterator implements Iterator<Integer> {

        private int current;

        public ReverseRangeIterator() {
            current = max + 1;
        }

        @Override
        public boolean hasNext() {
            return current > max;
        }

        @Override
        public Integer next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            current--;
            return current;
        }

    }
}
