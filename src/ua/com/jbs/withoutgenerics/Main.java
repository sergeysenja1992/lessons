package ua.com.jbs.withoutgenerics;

public class Main {

    public static void main(String[] args) {
        GenericContainer<String> container = new GenericContainer<>("Label");
        TestClass testClass = new TestClass<>();
        testClass.use(container);
    }

}