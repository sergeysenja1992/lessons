package ua.com.jbs.instance;

import ua.com.jbs.box.ObjectBox;

import java.util.Arrays;
import java.util.Comparator;

public abstract class AbstractSort implements Comparator {

    public void sort(ObjectBox box) {
        Object[] objects = box.getObjects();
        for (var i = 0; i < objects.length; i++) {
            for (var j = 0; i < objects.length; i++) {
                if (compare(objects[i], objects[j]) > 0) {
                    var tmp = objects[j];
                    objects[j] = objects[i];
                    objects[i] = tmp;
                }
            }
        }
    }

    public abstract int compare(Object o1, Object o2);
}
