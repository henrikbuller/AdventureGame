package org.adventure.weapon;

public class Shotgun implements WeaponBehavior{
    private String name = "Grandpas shotgun";
    @Override
    public int useWeapon() {
        return 45;
    }
    public String toString() {
        return name;
    }
}
