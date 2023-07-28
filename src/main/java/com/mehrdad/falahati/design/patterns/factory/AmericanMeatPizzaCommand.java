package com.mehrdad.falahati.design.patterns.factory;

public class AmericanMeatPizzaCommand implements PizzaSelectorCommand {

    private final PizzaSelectorExecutor executor;

    public AmericanMeatPizzaCommand(PizzaSelectorExecutor executor) {
        this.executor = executor;
        this.executor.registerCommand(getType(), this);
    }

    @Override
    public Pizza getInstance() {
        return new AmericanMeatPizza();
    }

    @Override
    public StoreType getType() {
        return StoreType.MEAT_AMERICAN;
    }
}
