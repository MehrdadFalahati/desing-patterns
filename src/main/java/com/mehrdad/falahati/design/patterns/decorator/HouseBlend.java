package com.mehrdad.falahati.design.patterns.decorator;

public class HouseBlend implements Beverage {
    @Override
    public double cost() {
        return .89;
    }

    @Override
    public String getDescription() {
        return "House Blend";
    }
}
