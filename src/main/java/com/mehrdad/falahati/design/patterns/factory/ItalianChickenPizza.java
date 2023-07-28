package com.mehrdad.falahati.design.patterns.factory;

public class ItalianChickenPizza extends Pizza {
    public ItalianChickenPizza() {
        super("ItalianChickenPizza", 2, 10.6);
    }

    @Override
    public void show() {
        System.out.println(getName() +" with size 2");
    }
}
