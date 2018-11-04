package ua.com.jbs;

public class Car {

    private int speed;
    private int energy;

    public void go() {
        useEnergy();
        speed++;
    }

    private void useEnergy() {
        energy--;
    }

    public void charge(int energy) {
        this.energy += energy;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", energy=" + energy +
                '}';
    }

}
