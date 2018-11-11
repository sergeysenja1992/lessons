package ua.com.jbs.instance;

public class NumberSort extends AbstractSort {

    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Integer)) {
            return 1;
        }
        if (!(o2 instanceof Integer)) {
            return -1;
        }
        return ((Integer) o1).compareTo((Integer) o2);
    }


}

