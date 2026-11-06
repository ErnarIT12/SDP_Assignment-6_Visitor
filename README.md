# Assignment 6: Visitor pattern

The topic is equipment in CS2. A player's loadout contains weapons, grenades, and armor. These types rarely change, but new operations on them can appear often, so each operation is a separate visitor. Prices and damage values are approximate.

## Pattern parts

| Part | Class |
|---|---|
| Element interface | `Equipment` |
| Concrete elements | `Weapon`, `Grenade`, `Armor` |
| Visitor interface | `EquipmentVisitor` |
| Concrete visitors | `PriceVisitor`, `DamageVisitor`, `PrintVisitor` |
| Object structure | `Loadout` |

## Double dispatch

`Loadout` stores items as `Equipment`, so the compiler does not know the real type of each item. Java selects the code in two steps:

1. `item.accept(visitor)` runs the `accept` method of the real element, for example `Weapon`.
2. `visitor.visitWeapon(this)` runs the method of the real visitor, for example `PriceVisitor`.

## Clean Code principles

1. Meaningful names. Elements are named after game items, and each visitor is named after its operation, such as `PriceVisitor`.
2. No type checks. The code has no `instanceof`, because double dispatch selects the correct method.
3. Single Responsibility. Each visitor does one operation: price, damage, or printing. `Loadout` only stores and traverses items.
4. Small encapsulation trade-off. Visitors need element data, so elements have getters. Fields are `private final` and there are no setters, so a visitor can read an element but cannot change it.
5. Extensibility. `PrintVisitor` is the third visitor. Adding it needed one new class and no changes to the elements, `Loadout`, or the other visitors. Its commit contains only that file.

## Limitation

Adding a new element type, such as a defuse kit, requires a new method in `EquipmentVisitor` and in all three visitors.

## Run

Run `org.example.Main` with JDK 25.
