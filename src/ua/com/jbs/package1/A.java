package ua.com.jbs.package1;

import ua.com.jbs.Color;

public class A {

    public static int staticField;

    public static final String CONSTANT = "SOME CONSTANT VALUE";

    private String field = "a";

    {
        // выполняеться перед конструктором
        field = "b";
    }

    static {
        // выполняеться при загрузке класса
        staticField = 0;
    }

    public void doWork() {
        this.doFirstPartOfWork();
        doSecondPartOfWork();
        print(2);
        print('2');
        print("2");
        print("work");
        call("string");

        Object string = "string";
        call(string);
    }

    private void field() {

    }

    private String method() {
        return "Some string";
    }


    private void doFirstPartOfWork() {
        System.out.print("Do ");
    }

    private void doSecondPartOfWork() {
        System.out.println("work");
    }

    private void print(int i) {
        System.out.println("int " + i);
    }

    private void print(String str) {
        System.out.println("string " + str);
    }

    private void call(String i) {
        System.out.println("string");
    }

    private void call(Object i) {
        System.out.println("object");
    }

    public void args(int arg1, int arg2, String arg3, String... args) {

    }

    public static void staticMethod() {
        // no this, and only static state
    }

    public void colorize(Color color) {
        System.out.println(color);
    }

}
