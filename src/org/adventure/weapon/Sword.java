package org.adventure.weapon;

public class Sword implements WeaponBehavior {
    String name = "Rusty sword";
    @Override
    public int useWeapon() {
        return 15   ;
    }

    public String toString () {
        return "a " + name;
    }

}
