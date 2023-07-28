package com.mehrdad.falahati.design.patterns.factory;

public final class ItalianPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "chicken" -> new ItalianChickenPizza();
            case "meat" -> new ItalianMeatPizza();
            default -> throw new IllegalArgumentException("we do not have this " + type + "of pizza");
        };
    }
}
