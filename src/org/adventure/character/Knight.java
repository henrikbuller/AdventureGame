package org.adventure.character;

import org.adventure.weapon.WeaponBehavior;

public class Knight extends Character {

    public Knight (String name) {
        super(name);
    }

    public Knight (String name, WeaponBehavior weapon) {
        super(name, weapon);
    }

    @Override
    public void fight(Character opponent) {
        if(weapon() == null) {
            System.out.println("Hitting and kicking (in lack of weapon)!");
            opponent.takeDamage(5);
        } else {
            System.out.println("-None shall pass!");
            System.out.println(getName() + " nobly uses its " + weapon() + " against the simple " + opponent.getName());
            opponent.takeDamage(weapon().useWeapon());
        }
        System.out.println(" Score after attack: " + this + " - " + opponent);

    }

}
