package org.example;

public class DamageVisitor implements EquipmentVisitor {
    private int totalDamage;

    @Override
    public void visitWeapon(Weapon weapon) {
        totalDamage += weapon.getDamage() * weapon.getAmmo();
    }

    @Override
    public void visitGrenade(Grenade grenade) {
        totalDamage += grenade.getDamage();
    }

    @Override
    public void visitArmor(Armor armor) {
        // Armor does not deal damage
    }

    public int getTotalDamage() {
        return totalDamage;
    }
}
