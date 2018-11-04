package ua.com.jbs.defaultmethods;

public class StringSortable implements Sortable {

    @Override
    public boolean isMore(Object o, Object o1) {
        return o.toString().compareTo(o1.toString()) > 0;
    }
}
