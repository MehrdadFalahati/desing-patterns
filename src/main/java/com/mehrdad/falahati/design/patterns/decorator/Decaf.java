package com.mehrdad.falahati.design.patterns.decorator;

public class Decaf implements Beverage {
    @Override
    public double cost() {
        return 1.05;
    }

    @Override
    public String getDescription() {
        return "Decaf";
    }
}
