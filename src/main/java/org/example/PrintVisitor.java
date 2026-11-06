package org.example;

public class PrintVisitor implements EquipmentVisitor {
    @Override
    public void visitWeapon(Weapon weapon) {
        System.out.println(weapon.getName() + ": " + weapon.getDamage() + " damage, " + weapon.getAmmo() + " ammo");
    }

    @Override
    public void visitGrenade(Grenade grenade) {
        System.out.println(grenade.getName() + ": " + grenade.getDamage() + " damage");
    }

    @Override
    public void visitArmor(Armor armor) {
        System.out.println(armor.getName() + ": " + armor.getProtection() + " protection");
    }
}
