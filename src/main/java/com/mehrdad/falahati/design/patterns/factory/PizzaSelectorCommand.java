package com.mehrdad.falahati.design.patterns.factory;

public interface PizzaSelectorCommand {
    Pizza getInstance();
    StoreType getType();
}
