package ua.com.jbs.generics;

import ua.com.jbs.box.ObjectBox;

import java.util.Arrays;
import java.util.Comparator;

public abstract class AbstractSort<T> implements Comparator<T> {

    public void sort(GenericsBox<T> box) {
        T[] objects = box.getObjects();
        for (var i = 0; i < objects.length; i++) {
            for (var j = 0; j < objects.length; j++) {
                if (compare(objects[i], objects[j]) < 0) {
                    var tmp = objects[j];
                    objects[j] = objects[i];
                    objects[i] = tmp;
                }
            }
        }
    }

    public abstract int compare(T o1, T o2);
}
