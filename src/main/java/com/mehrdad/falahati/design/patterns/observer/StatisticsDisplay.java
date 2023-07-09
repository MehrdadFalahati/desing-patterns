package com.mehrdad.falahati.design.patterns.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticsDisplay implements Observer, Display {
    private final List<Double> temperatures;
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.temperatures = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " +
                avg()
                + "/" + max()
                + "/" + min());
    }

    @Override
    public void update() {
        temperatures.add(weatherData.getTemperature());
        display();
    }

    public double avg() {
        double sum = 0;
        for (Double temperature : temperatures) {
            sum += temperature;
        }
        return sum / temperatures.size();
    }

    public double max() {
        return Collections.max(temperatures);
    }

    public double min() {
        return Collections.min(temperatures);
    }

}
