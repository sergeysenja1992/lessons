package ua.com.jbs.iterable;

public class Main {

    public static void main(String[] argv) {

        Factorial factorial = new Factorial(6);
        for (var number: factorial) {
            System.out.println(number);
        }
        for (var number: factorial) {
            System.out.println(number);
        }

        System.out.println("======");

        WrongFactorial wrongFactorial = new WrongFactorial(6);
        for (var number: wrongFactorial) {
            System.out.println(number);
        }
        for (var number: wrongFactorial) {
            System.out.println(number);
        }

    }

}
