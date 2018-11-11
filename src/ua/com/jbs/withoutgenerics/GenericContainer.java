package ua.com.jbs.withoutgenerics;

public class GenericContainer<T> implements Container<T> {
    private final T t;

    public GenericContainer(T t) {
        this.t = t;
    }

    @Override
    public T get() {
        return t;
    }
}
