package org.example;

public class Weapon implements Equipment {
    private final String name;
    private final int price;
    private final int damage;
    private final int ammo;

    public Weapon(String name, int price, int damage, int ammo) {
        this.name = name;
        this.price = price;
        this.damage = damage;
        this.ammo = ammo;
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitWeapon(this);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDamage() {
        return damage;
    }

    public int getAmmo() {
        return ammo;
    }
}
