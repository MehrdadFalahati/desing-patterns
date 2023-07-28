package com.mehrdad.falahati.design.patterns.factory;

public class AmericanChickenPizza extends Pizza {
    public AmericanChickenPizza() {
        super("AmericanChickenPizza", 1, 16.3);
    }

    @Override
    public void show() {
        System.out.println(getName() + " with size 1");
    }
}
