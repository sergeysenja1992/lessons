package ua.com.jbs.box;

public class ObjectBox {

    private Object[] objects = new Object[0];

    public void add(Object object) {
        var newObjects = new Object[objects.length + 1];
        System.arraycopy(objects, 0, newObjects, 0, objects.length);
        newObjects[objects.length] = object;
        objects = newObjects;
    }

    public Object[] getObjects() {
        return objects;
    }
}
