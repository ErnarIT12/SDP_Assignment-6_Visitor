package org.example;

public class PriceVisitor implements EquipmentVisitor {
    private int totalPrice;

    @Override
    public void visitWeapon(Weapon weapon) {
        totalPrice += weapon.getPrice();
    }

    @Override
    public void visitGrenade(Grenade grenade) {
        totalPrice += grenade.getPrice();
    }

    @Override
    public void visitArmor(Armor armor) {
        totalPrice += armor.getPrice();
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
