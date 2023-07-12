package com.mehrdad.falahati.design.patterns.decorator;

public class Mocha extends CondimentDecorator {
    protected Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
