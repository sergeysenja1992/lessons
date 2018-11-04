package ua.com.jbs.badorder;

public class Main {

    public static void main(String[] argv) {
        Order order = new Order();
        int total = 0;
        for (OrderIteam item: order.getItems()) {
            total += item.getPrice().getPrice();
        }
    }

}
