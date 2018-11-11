package ua.com.jbs.withoutgenerics;

public class TestClass<R> {

    public <T> void use(Container<T> container) {
        T item = container.get();
        System.out.println(item);
    }

    public void use(GenericContainer<Integer> container) {
        Integer item = container.get();
        System.out.println(item);
    }

}
