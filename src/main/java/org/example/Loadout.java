package org.example;

import java.util.ArrayList;
import java.util.List;

public class Loadout {
    private final List<Equipment> items = new ArrayList<>();

    public void add(Equipment item) {
        items.add(item);
    }

    public void accept(EquipmentVisitor visitor) {
        for (Equipment item : items) {
            item.accept(visitor);
        }
    }
}
