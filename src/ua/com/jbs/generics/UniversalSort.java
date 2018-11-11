package ua.com.jbs.generics;

public class UniversalSort<T extends Comparable<T>> extends AbstractSort<T> {

    @Override
    public int compare(T o1, T o2) {
        // пусть будет инкапсуляция пусть обьект сам будет знать как его сравнивать
        return o1.compareTo(o2);
    }

}

