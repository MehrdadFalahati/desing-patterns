package com.mehrdad.falahati.design.patterns.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StarbuzzCoffeeTest {

    @Test
    void test_decorator_pattern() {
        var espresso = new Espresso();
        assertEquals(1.99, espresso.cost());
        assertEquals("Espresso", espresso.getDescription());

        var beverage = new Whip(new Mocha(new Mocha(new DarkRoast())));
        assertEquals(1.49, beverage.cost());
        assertEquals("Dark Roast, Mocha, Mocha, Whip", beverage.getDescription());
    }
}
