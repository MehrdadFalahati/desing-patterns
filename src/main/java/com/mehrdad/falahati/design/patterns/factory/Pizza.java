package com.mehrdad.falahati.design.patterns.factory;

public abstract class Pizza {
    private final String name;
    private final int size;
    private final double cost;

    public Pizza(String name, int size, double cost) {
        this.name = name;
        this.size = size;
        this.cost = cost;
    }

    public double cost() {
        return size * cost;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
