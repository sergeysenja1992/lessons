package ua.com.jbs.generics;

import ua.com.jbs.box.ObjectBox;

import java.util.Arrays;

public class SimpleSort {

    public void sort(GenericsBox<Integer> box) {
        Arrays.sort(box.getObjects());
    }

}
