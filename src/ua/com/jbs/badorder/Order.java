package ua.com.jbs.badorder;

public class Order {

    private OrderIteam[] items;

    private String target;

    public void setItems(OrderIteam[] items) {
        this.items = items;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public OrderIteam[] getItems() {
        return items;
    }

    public String getTarget() {
        return target;
    }
}
