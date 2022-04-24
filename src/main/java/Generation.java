package main.java;

import java.util.Random;

import main.java.characterbuilder.Character;
import main.java.enemyfactory.Enemy;
import main.java.enemyfactory.EnemyFactory;

// TODO: Auto-generated Javadoc
/**
 * The generation class is used to generate values for the character and the
 * enemy.
 */
public class Generation {

    /** The species list. */
    static String[] speciesList = { "Human", "Twilek", "Zabrak", "Droid", "Wookie", "Hutt" };

    /** The role list. */
    static String[] roleList = { "Jedi", "Trooper", "Sniper", "Bounty Hunter", "Gunslinger" };

    /** The status list. */
    static String[] statusList = { "Blind", "Foolhardy", "Tough", "Diseased", "Lucky", "Quick" };

    /** The small enemy list. */
    static String[] smallEnemyList = { "Battle Droid", "Stormtrooper", "K'lor'slug", "Jawa", "Assassin Droid", "Stormtrooper Sniper", "B2 Battle Droid", "Gundark", "Colicoid" };

    /** The medium enemy list. */
    static String[] mediumEnemyList = { "Droideka", "Stormtrooper Captain", "Sith Trooper", "Imperial Guard", "Dark Trooper", "B3 Battle Droid", "Droid Tank", };

    /** The boss enemy list. */
    static String[] bossEnemyList = { "Darth Maul", "Darth Vader", "Boba Fett", "Count Dooku", "General Grevious", "Ventress", "Tarkin", "IG-88", "Grand Admiral Thrawn" };

    /** The Naked character. */
    static boolean NakedCharacter;

    /** The Character jedi. */
    static boolean CharacterJedi;

    /** The helmet. */
    static String helmet;

    /** The armor. */
    static String armor;

    /** The pants. */
    static String pants;

    /** The boots. */
    static String boots;

    /** The credits. */
    private static int credits = 0;

    /** The level. */
    private static int level = 1;

    /** The exp. */
    private static int exp = 0;

    /** The damage. */
    private static int damage;

    /** The Constant smallEnemyHealth. */
    private static final int smallEnemyHealth = 30;

    /** The Constant mediumEnemyHealth. */
    private static final int mediumEnemyHealth = 60;

    /** The Constant bossEnemyHealth. */
    private static final int bossEnemyHealth = 90;

    /** The Constant smallExp. */
    private static final int smallExp = 25;

    /** The Constant mediumExp. */
    private static final int mediumExp = 50;

    /** The Constant bossExp. */
    private static final int bossExp = 100;

    /** The force. */
    private static int force = 0;

    /** The r. */
    static Random r = new Random();

    /**
     * Generate enemy.
     *
     * @param floor the floor
     * @return the enemy
     */
    public static Enemy generateEnemy(int floor) {

        // medium enemy generated every 5 floors
        if (floor % 10 == 5) {

            int minDamage = 25;
            int maxDamage = 35;
            damage = (int) Math.floor(Math.random() * (maxDamage - minDamage + 1) + minDamage);

            int minSpeed = 25;
            int maxSpeed = 60;
            int speed = (int) Math.floor(Math.random() * (maxSpeed - minSpeed + 1) + minSpeed);

            int minCredits = 0;
            int maxCredits = 50;
            int credits = (int) Math.floor(Math.random() * (maxCredits - minCredits + 1) + minCredits);

            String result = mediumEnemyList[r.nextInt(mediumEnemyList.length)];

            Enemy enemy = EnemyFactory.createEnemy("Medium", result, damage, damage, mediumEnemyHealth, force, speed, mediumExp, credits);

            return enemy;

        }

        if (floor % 10 == 0) {

            int minDamage = 35;
            int maxDamage = 45;
            damage = (int) Math.floor(Math.random() * (maxDamage - minDamage + 1) + minDamage);

            int minSpeed = 25;
            int maxSpeed = 60;
            int speed = (int) Math.floor(Math.random() * (maxSpeed - minSpeed + 1) + minSpeed);

            int minCredits = 0;
            int maxCredits = 50;
            int credits = (int) Math.floor(Math.random() * (maxCredits - minCredits + 1) + minCredits);

            String result = bossEnemyList[r.nextInt(bossEnemyList.length)];

            Enemy enemy = EnemyFactory.createEnemy("Boss", result, damage, damage, bossEnemyHealth, force, speed, bossExp, credits);

            return enemy;

        } else {

            int minDamage = 15;
            int maxDamage = 20;
            damage = (int) Math.floor(Math.random() * (maxDamage - minDamage + 1) + minDamage);

            int minSpeed = 25;
            int maxSpeed = 60;
            int speed = (int) Math.floor(Math.random() * (maxSpeed - minSpeed + 1) + minSpeed);

            int minCredits = 0;
            int maxCredits = 50;
            int credits = (int) Math.floor(Math.random() * (maxCredits - minCredits + 1) + minCredits);

            String result = smallEnemyList[r.nextInt(smallEnemyList.length)];

            Enemy enemy = EnemyFactory.createEnemy("Small", result, damage, damage, smallEnemyHealth, force, speed, smallExp, credits);

            return enemy;

        }

    }

    /**
     * Generate character.
     *
     * @return the character
     */
    public static Character generateCharacter() {

        String species = Generation.generateSpecies();
        String role = Generation.generateRole();
        String weapon = Generation.generateWeapon(role);
        String equipment = Generation.generateEquipment(species, role);
        int healthPoints = Generation.generateHp(species);
        int force = Generation.generateForce(role);
        int physicalDmg = Generation.generatePhysicalDmg();
        int specialDmg = Generation.generateSpecialDmg(role);
        int speed = Generation.generateSpeed(species);
        String status = Generation.generateStatus();

        System.out.println("Species: " + species);
        System.out.println("Role: " + role);
        System.out.println("Weapon: " + weapon);
        System.out.println("Equipment: " + equipment);
        System.out.println("healthPoints: " + healthPoints);
        System.out.println("Force: " + force);
        System.out.println("Physical Damage: " + physicalDmg);
        System.out.println("Special Damage: " + specialDmg);
        System.out.println("Speed: " + speed);
        System.out.println("Status: " + status);
        System.out.println("Credits: " + credits);
        System.out.println("Level: " + level);
        System.out.println("Experience: " + exp);

        if (equipment.equals("none")) {

            NakedCharacter = true;

        }

        if (role.equals("Jedi")) {

            CharacterJedi = true;

        }

        if (!equipment.equals("None") && !CharacterJedi) {

            String[] tokens = equipment.split("/");

            helmet = tokens[0];
            armor = tokens[1];
            pants = tokens[2];
            boots = tokens[3];

        }

        if (NakedCharacter) {

            Character character = new Character.CharacterBuilder(role).species(species).weapon(weapon).healthPoints(healthPoints).force(force).physicalDmg(physicalDmg).specialDmg(
                                                                                                                                                                                specialDmg)
                                                                                                                                                                                .speed(speed)
                                                                                                                                                                                .exp(0)
                                                                                                                                                                                .level(1)
                                                                                                                                                                                .credits(0)
                                                                                                                                                                                .status(status)
                                                                                                                                                                                .build();

            return character;

        }

        if (CharacterJedi) {

            Character character1 = new Character.CharacterBuilder(role).species(species).weapon(weapon).armor(equipment).healthPoints(healthPoints).force(force).physicalDmg(physicalDmg)
                                                                                                                                                                                .specialDmg(specialDmg)
                                                                                                                                                                                .speed(speed)
                                                                                                                                                                                .exp(0)
                                                                                                                                                                                .level(1)
                                                                                                                                                                                .credits(0)
                                                                                                                                                                                .status(status)
                                                                                                                                                                                .build();

            return character1;

        } else {

            Character character2 = new Character.CharacterBuilder(role).species(species).weapon(weapon).helmet(helmet).armor(armor).pants(pants).boots(boots).healthPoints(healthPoints)
                                                                                                                                                                                .force(force)
                                                                                                                                                                                .physicalDmg(physicalDmg)
                                                                                                                                                                                .specialDmg(specialDmg)
                                                                                                                                                                                .speed(speed)
                                                                                                                                                                                .exp(0)
                                                                                                                                                                                .level(1)
                                                                                                                                                                                .credits(0)
                                                                                                                                                                                .status(status)
                                                                                                                                                                                .build();

            return character2;

        }

    }

    /**
     * Generate species.
     *
     * @return the string
     */
    public static String generateSpecies() {

        String result = speciesList[r.nextInt(speciesList.length)];

        return result;

    }

    /**
     * Generate role.
     *
     * @return the string
     */
    public static String generateRole() {

        String result = roleList[r.nextInt(roleList.length)];

        return result;

    }

    /**
     * Generate weapon.
     *
     * @param role the role
     * @return the string
     */
    public static String generateWeapon(String role) {

        String weapon = "none";

        switch (role) {

            case "Jedi":
                weapon = "Lightsaber";
                break;

            case "Trooper":
                weapon = "Blaster Cannon";
                break;

            case "Sniper":
                weapon = "Sniper Rifle";
                break;

            case "Bounty Hunter":
                weapon = "Blaster";
                break;

            case "Gunslinger":
                weapon = "Dual Blaster";
                break;

            default:
                weapon = "Blaster";

        }

        return weapon;
    }

    /**
     * Generate equipment.
     *
     * @param species the species
     * @param role    the role
     * @return the string
     */
    public static String generateEquipment(String species, String role) {

        String speciesCheck = species;
        String roleCheck = role;

        if (speciesCheck.equals("Droid") || speciesCheck.equals("Wookie") || speciesCheck.equals("Hutt")) {

            return "None";

        }

        if (roleCheck.equals("Jedi")) {

            String result = "JediRobes";

            return result;

        }

        if (roleCheck.equals("Trooper")) {

            String result = "TrooperHelmet/TrooperBodyArmor/TrooperLegPlates/TrooperBoots";

            return result;
        }

        if (roleCheck.equals("Sniper")) {

            String result = "SniperEyePiece/SniperJacket/SniperPants/SniperBoots";

            return result;
        }

        if (roleCheck.equals("Bounty Hunter")) {

            String result = "BHHelmet/BHArmor/BHLegPlate/BHBoots";

            return result;

        }

        if (roleCheck.equals("Gunslinger")) {

            String result = "GSHat/GSJacket/GSPants/GSBoots";

            return result;
        }

        return null;

    }

    /**
     * Generate healthPoints.
     *
     * @param species the species
     * @return the int
     */
    public static int generateHp(String species) {

        int healthPoints = 0;

        switch (species) {

            case "Human":
                healthPoints = 120;
                break;

            case "Twilek":
                healthPoints = 90;
                break;

            case "Zabrak":
                healthPoints = 140;
                break;

            case "Droid":

                healthPoints = 110;
                break;

            case "Wookie":
                healthPoints = 190;
                break;

            case "Hutt":
                healthPoints = 220;
                break;

            default:
                healthPoints = 150;

        }

        return healthPoints;
    }

    /**
     * Generate force.
     *
     * @param role the role
     * @return the int
     */
    public static int generateForce(String role) {

        int min = 50;
        int max = 100;
        int force = (int) Math.floor(Math.random() * (max - min + 1) + min);

        if (role.equals("Jedi")) {

            return force;
        }

        return 0;

    }

    /**
     * Generate physical dmg.
     *
     * @return the int
     */
    public static int generatePhysicalDmg() {

        int min = 25;
        int max = 50;

        int dmg = (int) Math.floor(Math.random() * (max - min + 1) + min);

        return dmg;

    }

    /**
     * Generate special dmg.
     *
     * @param role the role
     * @return the int
     */
    public static int generateSpecialDmg(String role) {

        if (role.equals("Jedi")) {

            int min = 30;
            int max = 60;

            int dmg = (int) Math.floor(Math.random() * (max - min + 1) + min);

            return dmg;

        }

        return 0;

    }

    /**
     * Generate speed.
     *
     * @param species the species
     * @return the int
     */
    public static int generateSpeed(String species) {
        int speed = 0;

        switch (species) {

            case "Human":
                speed = 50;
                break;

            case "Twilek":
                speed = 55;
                break;

            case "Zabrak":
                speed = 60;
                break;

            case "Droid":
                speed = 30;
                break;

            case "Wookie":
                speed = 40;
                break;

            case "Hutt":
                speed = 25;
                break;

            default:
                speed = 50;

        }

        return speed;
    }

    /**
     * Generate status.
     *
     * @return the string
     */
    public static String generateStatus() {

        String result = statusList[r.nextInt(statusList.length)];

        return result;

    }

}
