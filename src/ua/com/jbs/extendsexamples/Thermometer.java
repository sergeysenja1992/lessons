package ua.com.jbs.extendsexamples;

import java.util.Random;

public class Thermometer implements TemperatureProducer {

    @Override
    public double getTemperature() {
        return new Random().nextDouble();
    }

}
