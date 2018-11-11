package ua.com.jbs.generics;

public class GenericsBox<T> {

    private T[] objects = (T[]) new Object[0];

    public void add(T object) {
        var newObjects = new Object[objects.length + 1];
        System.arraycopy(objects, 0, newObjects, 0, objects.length);
        newObjects[objects.length] = object;
        objects = (T[]) newObjects;
    }

    public T[] getObjects() {
        return objects;
    }

}
