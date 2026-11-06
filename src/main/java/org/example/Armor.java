package org.example;

public class Armor implements Equipment {
    private final String name;
    private final int price;
    private final int protection;

    public Armor(String name, int price, int protection) {
        this.name = name;
        this.price = price;
        this.protection = protection;
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitArmor(this);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getProtection() {
        return protection;
    }
}
