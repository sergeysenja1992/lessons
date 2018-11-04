package ua.com.jbs.goodorder;

public class Order {

    private OrderIteam[] items;

    private String target;

    public Order(OrderIteam[] items, String target) {
    }

    public int getTotal() {
        int total = 0;
        for (OrderIteam item: items) {
            total += item.getItemPrice();
        }
        return total;
    }

}
