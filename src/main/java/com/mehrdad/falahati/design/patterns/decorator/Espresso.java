package com.mehrdad.falahati.design.patterns.decorator;

public class Espresso implements Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
