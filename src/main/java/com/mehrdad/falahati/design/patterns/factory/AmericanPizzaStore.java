package com.mehrdad.falahati.design.patterns.factory;

public final class AmericanPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "chicken" -> new AmericanChickenPizza();
            case "meat" -> new AmericanMeatPizza();
            default -> throw new IllegalArgumentException("we do not have this " + type + "of pizza");
        };
    }
}
