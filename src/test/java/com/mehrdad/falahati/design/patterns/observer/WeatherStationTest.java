package com.mehrdad.falahati.design.patterns.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherStationTest {

    @Test
    void test_weather_station() {
        var weatherData = new WeatherData();
        var currentDisplay = new CurrentConditionDisplay(weatherData);
        var statisticDisplay = new StatisticsDisplay(weatherData);
        var forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4);
        assertEquals(80, currentDisplay.getTemperature());
        assertEquals(65, currentDisplay.getHumidity());

        assertEquals(80, statisticDisplay.avg());
        assertEquals(80, statisticDisplay.max());
        assertEquals(80, statisticDisplay.min());

        assertTrue(forecastDisplay.getLastPressure() < forecastDisplay.getCurrentPressure());

        weatherData.setMeasurements(82, 70, 29.2);
        assertEquals(82, currentDisplay.getTemperature());
        assertEquals(70, currentDisplay.getHumidity());

        assertEquals(81, statisticDisplay.avg());
        assertEquals(82, statisticDisplay.max());
        assertEquals(80, statisticDisplay.min());

        assertTrue(forecastDisplay.getLastPressure() > forecastDisplay.getCurrentPressure());

        weatherData.setMeasurements(78, 90, 29.2);
        assertEquals(78, currentDisplay.getTemperature());
        assertEquals(90, currentDisplay.getHumidity());

        assertEquals(80, statisticDisplay.avg());
        assertEquals(82, statisticDisplay.max());
        assertEquals(78, statisticDisplay.min());

        assertEquals(forecastDisplay.getLastPressure(), forecastDisplay.getCurrentPressure());

    }

}