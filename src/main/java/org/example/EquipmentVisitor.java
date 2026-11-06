package org.example;

public interface EquipmentVisitor {
    void visitWeapon(Weapon weapon);

    void visitGrenade(Grenade grenade);

    void visitArmor(Armor armor);
}
