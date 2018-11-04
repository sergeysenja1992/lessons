package ua.com.jbs.abs;

public class IceCar extends Car {

    private int petrol;

    @Override
    protected void useEnergy() {
        petrol--;
    }
}
