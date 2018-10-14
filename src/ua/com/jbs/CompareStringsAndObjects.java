package ua.com.jbs;

import ua.com.jbs.package1.A;
import ua.com.jbs.package1.D;
import ua.com.jbs.package2.C;

import static ua.com.jbs.Color.GREEN;

public class CompareStringsAndObjects {

    public static void main(String[] args) {

        Object object1 = new Object();
        Object object2 = new Object();

        A a = new A();

        a.doWork();

        new C();
        new C(1);

        a.args(1, 2, "arg3", "раз", "two", "what ever you want", "ololo");

        A.staticField = 1;
        A.staticMethod();

        a.colorize(Color.RED);
        a.colorize(GREEN);


        D d1 = new D();
        d1.field = "1";
        D d2 = d1;
        d2.field = "2";
        System.out.println(d1.field);

        D d3 = new D();
        d3.field = "2";

        System.out.println(d3 == d2);

        System.out.println("test" == "test");

        System.out.println(new String("test") == new String("test"));

        System.out.println(new String("test").equals(new String("test")));

        System.out.println(d3.equals(d2));

    }

}
