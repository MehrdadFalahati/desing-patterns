package com.mehrdad.falahati.design.patterns.factory;

import java.util.EnumMap;
import java.util.Map;

public class PizzaSelectorExecutor {
    private final Map<StoreType, PizzaSelectorCommand> map;

    public PizzaSelectorExecutor() {
        this.map = new EnumMap<>(StoreType.class);
    }

    public void registerCommand(StoreType storeType, PizzaSelectorCommand observer) {
        map.putIfAbsent(storeType, observer);
    }

    public void removeCommand(StoreType storeType) {
        map.remove(storeType);
    }

    public Pizza getInstance(StoreType storeType) {
        return map.get(storeType).getInstance();
    }
}
