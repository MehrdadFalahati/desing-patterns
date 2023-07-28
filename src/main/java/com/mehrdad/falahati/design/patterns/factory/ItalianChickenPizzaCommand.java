package com.mehrdad.falahati.design.patterns.factory;

public class ItalianChickenPizzaCommand implements PizzaSelectorCommand {

    private final PizzaSelectorExecutor executor;

    public ItalianChickenPizzaCommand(PizzaSelectorExecutor executor) {
        this.executor = executor;
        this.executor.registerCommand(getType(), this);
    }

    @Override
    public Pizza getInstance() {
        return new ItalianChickenPizza();
    }

    @Override
    public StoreType getType() {
        return StoreType.CHICKEN_ITALIAN;
    }

}
