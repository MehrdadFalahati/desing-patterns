package com.mehrdad.falahati.design.patterns.decorator;

public class DarkRoast implements Beverage {
    @Override
    public double cost() {
        return .99;
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }
}
