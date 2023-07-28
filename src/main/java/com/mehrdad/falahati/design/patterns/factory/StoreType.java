package com.mehrdad.falahati.design.patterns.factory;

public enum StoreType {
    CHICKEN_AMERICAN, MEAT_AMERICAN, CHICKEN_ITALIAN, MEAT_ITALIAN;

    public static StoreType getStoreType(String regin, PizzaType pizzaType) {
        return switch (regin) {
            case "AMERICAN" -> switch (pizzaType) {
                case MEAT -> MEAT_AMERICAN;
                case CHICKEN -> CHICKEN_AMERICAN;
            };
            case "ITALIAN" -> switch (pizzaType) {
                case MEAT -> MEAT_ITALIAN;
                case CHICKEN -> CHICKEN_ITALIAN;
            };
            default -> throw new IllegalArgumentException("we do not have this " + pizzaType + "of pizza");
        };
    }
}
