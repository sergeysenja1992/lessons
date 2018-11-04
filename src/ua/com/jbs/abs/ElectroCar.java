package ua.com.jbs.abs;

public class ElectroCar extends Car {

    private final int MAX_BATTERY = 100;

    private int battery;

    @Override
    protected void useEnergy() {
        battery = battery - 1 - (1 - battery / MAX_BATTERY);
    }

}
