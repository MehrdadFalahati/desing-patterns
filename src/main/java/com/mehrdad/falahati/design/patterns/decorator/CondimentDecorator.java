package com.mehrdad.falahati.design.patterns.decorator;

public abstract class CondimentDecorator implements Beverage {
    protected final Beverage beverage;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
