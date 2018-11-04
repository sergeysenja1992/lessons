package ua.com.jbs.extendsexamples;

public class GoodTemperatureDisplay {

    private Thermometer thermometer;

    public GoodTemperatureDisplay(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

    public void showTemperature() {
        System.out.println(thermometer.getTemperature());
    }

}
