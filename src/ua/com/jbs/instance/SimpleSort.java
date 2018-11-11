package ua.com.jbs.instance;

import ua.com.jbs.box.ObjectBox;

import java.util.Arrays;

public class SimpleSort {

    public void sort(ObjectBox box) {
        Arrays.sort(box.getObjects());
    }

}
