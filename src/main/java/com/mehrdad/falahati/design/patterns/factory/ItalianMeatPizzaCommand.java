package com.mehrdad.falahati.design.patterns.factory;

public class ItalianMeatPizzaCommand implements PizzaSelectorCommand {

    private final PizzaSelectorExecutor executor;

    public ItalianMeatPizzaCommand(PizzaSelectorExecutor executor) {
        this.executor = executor;
        this.executor.registerCommand(getType(), this);
    }

    @Override
    public Pizza getInstance() {
        return new ItalianMeatPizza();
    }

    @Override
    public StoreType getType() {
        return StoreType.MEAT_ITALIAN;
    }

}
