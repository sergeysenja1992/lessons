package ua.com.jbs.generics;

public class StringSort<T> extends AbstractSort<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
