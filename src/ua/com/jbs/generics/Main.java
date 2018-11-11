package ua.com.jbs.generics;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        GenericsBox<Integer> box = new GenericsBox<Integer>();
        //box.add("1");
        box.add(1);
        //box.add("2");
        box.add(2);
        //box.add("1234");
        box.add(1234);
        SimpleSort sort = new SimpleSort();
        sort.sort(box);
        System.out.println(Arrays.toString(box.getObjects()));

        GenericsBox<String> stringbox = new GenericsBox<>();
        stringbox.add("1");
        stringbox.add("2");
        stringbox.add("1234");

        StringSort<String> stringSort = new StringSort<>();
        stringSort.sort(stringbox);
        System.out.println(Arrays.toString(stringbox.getObjects()));

        UniversalSort<String> universalSort = new UniversalSort<>();
        universalSort.sort(stringbox);
        System.out.println(Arrays.toString(stringbox.getObjects()));

        UniversalSort<Integer> universalSortNumber = new UniversalSort<>();
        universalSortNumber.sort(box);
        System.out.println(Arrays.toString(box.getObjects()));

        sort(box);
        System.out.println(Arrays.toString(box.getObjects()));
        sort(stringbox);
        System.out.println(Arrays.toString(stringbox.getObjects()));
    }


    public static <T extends Comparable<T>> void sort(GenericsBox<T> box) {
        T[] objects = box.getObjects();
        for (var i = 0; i < objects.length; i++) {
            for (var j = 0; i < objects.length; i++) {
                if (objects[i].compareTo(objects[j]) > 0) {
                    var tmp = objects[j];
                    objects[j] = objects[i];
                    objects[i] = tmp;
                }
            }
        }

        GenericsBox<Number> number = new GenericsBox<>();
        GenericsBox<Integer> integer = new GenericsBox<>();
        copy(integer, number);

        //copyBox(integer, number);
    }

    public static <T> void copy(GenericsBox<? extends T> src, GenericsBox<? super T> dest) {
        for (var item: src.getObjects()) {
            dest.add(item);
        }
    }

    public static <T> void copyBox(GenericsBox<T> src, GenericsBox<T> dest) {
        for (var item: src.getObjects()) {
            dest.add(item);
        }
    }

}
