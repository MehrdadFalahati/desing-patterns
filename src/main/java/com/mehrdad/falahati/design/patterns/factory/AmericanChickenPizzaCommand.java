package com.mehrdad.falahati.design.patterns.factory;

public class AmericanChickenPizzaCommand implements PizzaSelectorCommand {

    private final PizzaSelectorExecutor executor;

    public AmericanChickenPizzaCommand(PizzaSelectorExecutor executor) {
        this.executor = executor;
        this.executor.registerCommand(getType(), this);
    }

    @Override
    public Pizza getInstance() {
        return new AmericanChickenPizza();
    }

    @Override
    public StoreType getType() {
        return StoreType.CHICKEN_AMERICAN;
    }
}
