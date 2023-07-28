package com.mehrdad.falahati.design.patterns.factory;

public final class ItalianPizzaStore extends PizzaStore {

    private final PizzaSelectorExecutor executor;

    public ItalianPizzaStore() {
        this.executor = new PizzaSelectorExecutor();
        new ItalianMeatPizzaCommand(executor);
        new ItalianChickenPizzaCommand(executor);
    }

    @Override
    protected Pizza createPizza(PizzaType type) {
        return executor.getInstance(StoreType.getStoreType("ITALIAN", type));
    }
}
