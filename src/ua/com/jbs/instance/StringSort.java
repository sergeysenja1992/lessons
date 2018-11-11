package ua.com.jbs.instance;

public class StringSort extends AbstractSort {

    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
