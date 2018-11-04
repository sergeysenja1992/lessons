package ua.com.jbs;

public class BadCar {

    private CarType carType;

    private int speed;
    private int petrol;
    private int energy;

    public BadCar(CarType carType) {
        this.carType = carType;
    }

    public void go() {
        useEnergy();
        speed++;
    }

    private void useEnergy() {
        if (carType == CarType.ELECTRO) {
            energy--;
        } else {
            petrol--;
        }
    }

    public void charge(int amount) {
        if (carType == CarType.ELECTRO) {
            this.energy += amount;
        } else {
            this.petrol += amount;
        }

    }

    @Override
    public String toString() {
        return "BadCar{" +
                "carType=" + carType +
                ", speed=" + speed +
                ", petrol=" + petrol +
                ", energy=" + energy +
                '}';
    }
}
