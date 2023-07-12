package com.mehrdad.falahati.design.patterns.decorator;

public class SteamedMilk extends CondimentDecorator {
    protected SteamedMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
