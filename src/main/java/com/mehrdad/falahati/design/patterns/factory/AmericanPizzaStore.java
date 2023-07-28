package com.mehrdad.falahati.design.patterns.factory;

public final class AmericanPizzaStore extends PizzaStore {
    private final PizzaSelectorExecutor executor;

    public AmericanPizzaStore() {
        this.executor = new PizzaSelectorExecutor();
        new AmericanChickenPizzaCommand(executor);
        new AmericanMeatPizzaCommand(executor);
    }

    @Override
    protected Pizza createPizza(PizzaType type) {
        return executor.getInstance(StoreType.getStoreType("AMERICAN", type));
    }
}
