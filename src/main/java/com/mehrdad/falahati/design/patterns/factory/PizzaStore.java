package com.mehrdad.falahati.design.patterns.factory;

public abstract class PizzaStore {

    public double orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.show();
        return pizza.cost();
    }

    protected abstract Pizza createPizza(String type);
}
