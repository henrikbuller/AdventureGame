package org.adventure.character;
import org.adventure.weapon.WeaponBehavior;

public class Troll extends Character {
    public Troll(String name, WeaponBehavior weapon) {
        super(name, weapon);
    }

    public Troll(String name) {
        super(name);
    }

    @Override
    public void fight(Character opponent) {
        if(weapon() == null) {
            System.out.println("Hitting and kicking (in lack of weapon)!");
            opponent.takeDamage(5);
        } else {
            System.out.println(getName() + "uses its " + weapon() + " against " + opponent.getName());
            opponent.takeDamage(weapon().useWeapon());
        }
            System.out.println("Score after game: " + this + " - " + opponent);
    }
}
