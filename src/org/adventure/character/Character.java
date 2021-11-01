package org.adventure.character;

import org.adventure.weapon.WeaponBehavior;

public abstract class Character {
    private WeaponBehavior weapon;
    private String name;
    private int health = 100;
    public Character(String name) {
        this.name = name;
    }
    public Character(String name, WeaponBehavior weapon) {
      this(name);
      this.weapon = weapon;
    }
    public String getName () {
        return name;
    }
    public void changeWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    public WeaponBehavior weapon(){ return weapon; }

    public void takeDamage(int damage) {
        health -= damage;
    }
    public abstract void fight (Character opponent);

    public int getHealth(){ return health; }
    public String toString(){
        return name
                + " with health: " + health
                + ((weapon!=null)?" carrying " + weapon :"");
    }

}
