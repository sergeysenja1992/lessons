package ua.com.jbs.iterable;

import java.util.Iterator;

public class WrongFactorial implements Iterable {

    private int number;
    private int factor = 1;
    private int current = 1;

    public WrongFactorial(int number) {
        this.number = number;
    }

    @Override
    public Iterator iterator() {
        return new FactorialIterator();
    }

    class FactorialIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return factor <= number || (number == 0 && factor == 1);
        }

        @Override
        public Object next() {
            current = current * factor;
            factor++;
            return current;
        }
    }

}
