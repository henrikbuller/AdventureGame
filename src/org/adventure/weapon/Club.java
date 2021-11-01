package org.adventure.weapon;

import org.adventure.weapon.WeaponBehavior;

public class Club implements WeaponBehavior {
    private String name = "Giant club";
    @Override
    public int useWeapon() {
        return 20;
    }

    @Override
    public String toString() {
        return "a " + name;
    }
}
