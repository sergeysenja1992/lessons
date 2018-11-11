package ua.com.jbs.instance;

import ua.com.jbs.box.ObjectBox;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.add("1");
        box.add(1);
        box.add("2");
        box.add(2);
        box.add("1234");
        box.add(1234);
        SimpleSort sort = new SimpleSort();
        //sort.sort(box);
        System.out.println(Arrays.toString(box.getObjects()));

        StringSort stringSort = new StringSort();
        stringSort.sort(box);
        System.out.println(Arrays.toString(box.getObjects()));

        NumberSort smartSort = new NumberSort();
        smartSort.sort(box);
        System.out.println(Arrays.toString(box.getObjects()));


    }

}
