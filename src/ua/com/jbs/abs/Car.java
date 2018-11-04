package ua.com.jbs.abs;

public abstract class Car {

    private int speed;

    public void go() {
        useEnergy();
        speed++;
    }

    protected abstract void useEnergy();

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }
}
