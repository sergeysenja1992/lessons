package ua.com.jbs.goodorder;

public class OrderIteam {

    private String name;
    private int count;
    private Price price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public int getItemPrice() {
        return count * price.getPrice();
    }
}
