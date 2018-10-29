package ua.com.jbs;

import java.util.Random;

public class ForDemo {
    public static void main(String[] args){
         for(int i=1; i<11; i++){
              System.out.println("Count is: " + i);
         }

         for(init(); isContinue(); doAction());

        for(init(); isContinue(); doAction()) {
            System.out.println("do body");
        }
    }

    static void doAction() {
        System.out.println("do action");
    }

    static void init() {
        System.out.println("init");
    }

    static boolean isContinue() {
        var i = new Random().nextInt(10);
        var isContinue = i != 5;
        System.out.println("isContinue -> " + isContinue);
        return isContinue;
    }

}
