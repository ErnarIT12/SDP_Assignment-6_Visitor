package org.example;

public class Main {
    public static void main(String[] args) {
        Loadout loadout = new Loadout();
        loadout.add(new Weapon("AK-47", 2700, 36, 30));
        loadout.add(new Weapon("Desert Eagle", 700, 53, 7));
        loadout.add(new Grenade("HE Grenade", 300, 98));
        loadout.add(new Armor("Kevlar + Helmet", 1000, 100));

        PrintVisitor printVisitor = new PrintVisitor();
        PriceVisitor priceVisitor = new PriceVisitor();
        DamageVisitor damageVisitor = new DamageVisitor();

        loadout.accept(printVisitor);
        loadout.accept(priceVisitor);
        loadout.accept(damageVisitor);

        System.out.println("Total price: $" + priceVisitor.getTotalPrice());
        System.out.println("Total damage: " + damageVisitor.getTotalDamage());
    }
}
