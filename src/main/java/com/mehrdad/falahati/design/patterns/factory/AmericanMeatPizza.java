package com.mehrdad.falahati.design.patterns.factory;

public class AmericanMeatPizza extends Pizza {
    public AmericanMeatPizza() {
        super("AmericanMeatPizza", 1, 18.5);
    }

    @Override
    public void show() {
        System.out.println(getName() + "with size 1");
    }
}
