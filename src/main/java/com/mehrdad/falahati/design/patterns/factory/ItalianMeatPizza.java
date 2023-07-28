package com.mehrdad.falahati.design.patterns.factory;

public class ItalianMeatPizza extends Pizza {
    public ItalianMeatPizza() {
        super("ItalianMeatPizza", 2, 11.5);
    }

    @Override
    public void show() {
        System.out.println(getName() + " with size 2");
    }
}
