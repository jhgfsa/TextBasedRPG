package enemyfactory.java;

public class EnemyFactory {

    public static Enemy createEnemy(String type, String name, String[] drops, int physicalDmg, int specialDmg, int HP,
            int force, int speed, int exp, int credits) {

        if (type.equals(null) || type.isEmpty()) {

            return null;
        }

        switch (type) {

        case "Small":
            return new SmallEnemy(name, drops, physicalDmg, specialDmg, HP, force, speed, exp, credits);

        case "Medium":
            return new MediumEnemy(name, drops, physicalDmg, specialDmg, HP, force, speed, exp, credits);

        case "Boss":
            return new BossEnemy(name, drops, physicalDmg, specialDmg, HP, force, speed, exp, credits);

        default:
            throw new IllegalArgumentException("Unknown type");
        }
    }

}
