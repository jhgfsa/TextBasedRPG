package main.java.enemyfactory;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Enemy objects.
 */
public class EnemyFactory {

    /**
     * Creates a new Enemy object.
     *
     * @param type        the type
     * @param name        the name
     * @param physicalDmg the physical dmg
     * @param specialDmg  the special dmg
     * @param HP          the hp
     * @param force       the force
     * @param speed       the speed
     * @param exp         the exp
     * @param credits     the credits
     * @return the enemy
     */
    public static Enemy createEnemy(String type, String name, int physicalDmg, int specialDmg, int HP, int force,
            int speed, int exp, int credits) {

        if (type.isEmpty()) {

            return null;
        }

        switch (type) {

        case "Small":
            return new SmallEnemy(name, physicalDmg, specialDmg, HP, force, speed, exp, credits);

        case "Medium":
            return new MediumEnemy(name, physicalDmg, specialDmg, HP, force, speed, exp, credits);

        case "Boss":
            return new BossEnemy(name, physicalDmg, specialDmg, HP, force, speed, exp, credits);

        default:
            throw new IllegalArgumentException("Unknown type");
        }
    }

}
