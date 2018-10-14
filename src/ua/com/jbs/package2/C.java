package ua.com.jbs.package2;

import ua.com.jbs.package1.A;

public class C {

    public C() {
        System.out.println("First constructor");
    }

    public C(String name) {
        System.out.println("Second constructor");
    }

    public C(int name) {
        this("" + name);
        System.out.println("Other constructor");
    }

    private int count;

    String firstname;

    protected String lastname;

    public String nickname;

    private A a;

    private B b;

    public int getCount() {
        System.out.println("Access to count");
        return count;
    }

    public void doWork() {
        B b = new B("some string");
        // not allow assign to final field b.s = "test";
    }

}
