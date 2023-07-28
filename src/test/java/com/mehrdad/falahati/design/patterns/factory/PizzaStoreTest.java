package com.mehrdad.falahati.design.patterns.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaStoreTest {

    @Test
    void testPizzaStore() {
        PizzaStore pizzaStore = new ItalianPizzaStore();
        double cost = pizzaStore.orderPizza(PizzaType.MEAT);
        assertEquals(23.0, cost);
    }
}
