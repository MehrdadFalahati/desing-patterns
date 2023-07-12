package com.mehrdad.falahati.design.patterns.decorator;

public interface Beverage {
    double cost();

    default String getDescription() {
        return "Unknown Beverage";
    }
}
