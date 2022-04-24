package main.java;

import java.util.Random;

import main.java.characterbuilder.Character;
import main.java.enemyfactory.Enemy;
import main.java.enemyfactory.EnemyFactory;

public class Generation {

    static String[] speciesList = { "Human", "Twilek", "Zabrak", "Droid", "Wookie", "Hutt" };
    static String[] roleList = { "Jedi", "Trooper", "Sniper", "Bounty Hunter", "Gunslinger" };
    static String[] statusList = { "Blind", "Foolhardy", "Tough", "Diseased", "Lucky", "Quick" };
    static String[] smallEnemyList = { "Battle Droid", "Stormtrooper", "K'lor'slug", "Jawa", "Assassin Droid",
            "Stormtrooper Sniper", "B2 Battle Droid", "Gundark", "Colicoid" };
    static String[] mediumEnemyList = { "Droideka", "Stormtrooper Captain", "Sith Trooper", "Imperial Guard",
            "Dark Trooper", "B3 Battle Droid", "Droid Tank", };
    static String[] bossEnemyList = { "Darth Maul", "Darth Vader", "Boba Fett", "Count Dooku", "General Grevious",
            "Ventress", "Tarkin", "IG-88", "Grand Admiral Thrawn" };

    String result;
    static boolean NakedCharacter;
    static boolean CharacterJedi;
    static String helmet;
    static String armor;
    static String pants;
    static String boots;
    private static int credits = 0;
    private static int level = 1;
    private static int exp = 0;
    private static int damage;
    private final static int smallEnemyHealth = 30;
    private final static int mediumEnemyHealth = 60;
    private final static int bossEnemyHealth = 90;
    private final static int smallExp = 25;
    private final static int mediumExp = 50;
    private final static int bossExp = 100;
    private static int force = 0;

    static Random r = new Random();

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

            Enemy enemy = EnemyFactory.createEnemy("Medium", result, damage, damage, mediumEnemyHealth, force, speed,
                    mediumExp, credits);

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

            Enemy enemy = EnemyFactory.createEnemy("Boss", result, damage, damage, bossEnemyHealth, force, speed,
                    bossExp, credits);

            return enemy;
        }

        else {

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

            Enemy enemy = EnemyFactory.createEnemy("Small", result, damage, damage, smallEnemyHealth, force, speed,
                    smallExp, credits);

            return enemy;

        }

    }

    public static Character generateCharacter() {

        String species = Generation.generateSpecies();
        String role = Generation.generateRole();
        String weapon = Generation.generateWeapon(role);
        String equipment = Generation.generateEquipment(species, role);
        int HP = Generation.generateHP(species);
        int force = Generation.generateForce(role);
        int physicalDmg = Generation.generatePhysicalDmg();
        int specialDmg = Generation.generateSpecialDmg(role);
        int speed = Generation.generateSpeed(species);
        String status = Generation.generateStatus();

        System.out.println("Species: " + species);
        System.out.println("Role: " + role);
        System.out.println("Weapon: " + weapon);
        System.out.println("Equipment: " + equipment);
        System.out.println("HP: " + HP);
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

            Character character = new Character.CharacterBuilder(role).species(species).weapon(weapon).HP(HP)
                    .force(force).physicalDmg(physicalDmg).specialDmg(specialDmg).speed(speed).exp(0).level(1)
                    .credits(0).status(status).build();

            return character;

        }

        if (CharacterJedi) {

            Character character1 = new Character.CharacterBuilder(role).species(species).weapon(weapon).armor(equipment)
                    .HP(HP).force(force).physicalDmg(physicalDmg).specialDmg(specialDmg).speed(speed).exp(0).level(1)
                    .credits(0).status(status).build();

            return character1;

        }

        else {

            Character character2 = new Character.CharacterBuilder(role).species(species).weapon(weapon).helmet(helmet)
                    .armor(armor).pants(pants).boots(boots).HP(HP).force(force).physicalDmg(physicalDmg)
                    .specialDmg(specialDmg).speed(speed).exp(0).level(1).credits(0).status(status).build();

            return character2;

        }

    }

    public static String generateSpecies() {

        String result = speciesList[r.nextInt(speciesList.length)];

        return result;

    }

    public static String generateRole() {

        String result = roleList[r.nextInt(roleList.length)];

        return result;

    }

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

        }

        return weapon;
    }

    public static String generateEquipment(String species, String role) {

        String SP = species;
        String RL = role;

        if (SP.equals("Droid") || SP.equals("Wookie") || SP.equals("Hutt")) {

            return "None";

        }

        if (RL.equals("Jedi")) {

            String result = "JediRobes";

            return result;

        }

        if (RL.equals("Trooper")) {

            String result = "TrooperHelmet/TrooperBodyArmor/TrooperLegPlates/TrooperBoots";

            return result;
        }

        if (RL.equals("Sniper")) {

            String result = "SniperEyePiece/SniperJacket/SniperPants/SniperBoots";

            return result;
        }

        if (RL.equals("Bounty Hunter")) {

            String result = "BHHelmet/BHArmor/BHLegPlate/BHBoots";

            return result;

        }

        if (RL.equals("Gunslinger")) {

            String result = "GSHat/GSJacket/GSPants/GSBoots";

            return result;
        }

        return null;

    }

    public static int generateHP(String species) {

        int HP = 0;

        switch (species) {

        case "Human":
            HP = 120;
            break;

        case "Twilek":
            HP = 90;
            break;

        case "Zabrak":
            HP = 140;
            break;

        case "Droid":
            HP = 110;
            break;

        case "Wookie":
            HP = 190;
            break;

        case "Hutt":
            HP = 220;
            break;

        }

        return HP;
    }

    public static int generateForce(String role) {

        int min = 50;
        int max = 100;
        int force = (int) Math.floor(Math.random() * (max - min + 1) + min);

        if (role.equals("Jedi")) {

            return force;
        }

        return 0;

    }

    public static int generatePhysicalDmg() {

        int min = 25;
        int max = 50;

        int dmg = (int) Math.floor(Math.random() * (max - min + 1) + min);

        return dmg;

    }

    public static int generateSpecialDmg(String role) {

        if (role.equals("Jedi")) {

            int min = 30;
            int max = 60;

            int dmg = (int) Math.floor(Math.random() * (max - min + 1) + min);

            return dmg;

        }

        return 0;

    }

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

        }

        return speed;
    }

    public static String generateStatus() {

        String result = statusList[r.nextInt(statusList.length)];

        return result;

    }

}
