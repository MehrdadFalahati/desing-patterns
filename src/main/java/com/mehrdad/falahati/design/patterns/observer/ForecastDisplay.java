package com.mehrdad.falahati.design.patterns.observer;

public class ForecastDisplay implements Observer, Display {
    private double currentPressure = 29.92;
    private double lastPressure;
    private final WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (lastPressure > currentPressure) {
            System.out.println("Forecast: Improving weather on the way");
        } else if (lastPressure < currentPressure) {
            System.out.println("Forecast: Watch out for cooler, rainy weather");
        } else {
            System.out.println("Forecast: More of the same");
        }
    }

    @Override
    public void update() {
        this.lastPressure = currentPressure;
        this.currentPressure = weatherData.getPressure();
        display();
    }

    public double getCurrentPressure() {
        return currentPressure;
    }

    public double getLastPressure() {
        return lastPressure;
    }
}
