package ua.com.jbs.goodorder;

public class Main {

    public static void main(String[] argv) {
        Order order = new Order(new OrderIteam[0], "address");
        int total = order.getTotal();
    }

}
