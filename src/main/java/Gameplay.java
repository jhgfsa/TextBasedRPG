package main.java;

import main.java.bosssingleton.FinalBoss;
import main.java.enemyfactory.Enemy;

// 
/**
 * The Class Gameplay contains the play method which is the main game flow of
 * this project.
 */
public class Gameplay {

    /** The floor. */
    static int floor = 1;

    /** The exp needed. */
    private static int expNeeded = 100;

    /** The character level. */
    private static int characterLevel = 1;

    /** The new HP. */
    private static int newHP;

    /** The new force. */
    private static int newForce;

    /** The new special dmg. */
    private static int newSpecialDmg;

    /** The new speed. */
    private static int newSpeed;

    /** The current HP. */
    private static int currentHP;

    /** The max HP. */
    private static int maxHP;

    private static int newDmg;

    /**
     * Performs the main gameplay sequence with generating enemies and battling
     * them.
     *
     * @param character the character
     * 
     */
    public static void play(main.java.characterbuilder.Character character) {

        maxHP = character.getHp();

        System.out.println("\n\nNow entering the Imperial Citadel, Floor 1...");

        while (character.getHp() > 0 && floor != 50) {

            Enemy enemy = Generation.generateEnemy(floor);
            String enemyName = enemy.getName();
            int remainingEnemyHealth = enemy.getHp();

            System.out.println("\nYou enter floor " + floor + " and encounter " + enemyName + "!");

            floor++;

            while (character.getHp() > 0 && remainingEnemyHealth > 0) {

                if (character.getSpeed() >= enemy.getSpeed()) {

                    remainingEnemyHealth = remainingEnemyHealth - character.getPhysicalDmg();
                    System.out.println("You attacked " + enemy.getName() + " for " + character.getPhysicalDmg() + " damage! They now have " + remainingEnemyHealth + " health left!");

                    int remainingPlayerHealth = character.getHp() - enemy.getPhysicalDmg();
                    remainingPlayerHealth = remainingPlayerHealth - character.getLevel() / 2;
                    int bossDamage = enemy.getPhysicalDmg() + character.getLevel() / 2;

                    character.setHp(remainingPlayerHealth);

                    System.out.println(enemy.getName() + " attacked you for " + bossDamage + " damage and you now have " + character.getHp() + " health remaining!");

                }

                if (character.getSpeed() <= enemy.getSpeed()) {

                    int remainingPlayerHealth = character.getHp() - enemy.getPhysicalDmg();
                    remainingPlayerHealth = remainingPlayerHealth - character.getLevel() / 2;
                    int bossDamage = enemy.getPhysicalDmg() + character.getLevel() / 2;

                    character.setHp(remainingPlayerHealth);

                    System.out.println(enemy.getName() + " attacked you for " + bossDamage + " and you now have " + character.getHp() + " health remaining!");

                    remainingEnemyHealth = remainingEnemyHealth - character.getPhysicalDmg();
                    System.out.println("You attacked " + enemy.getName() + " for " + character.getPhysicalDmg() + " damage! They now have " + remainingEnemyHealth + " health left!");

                }

            }

            if (character.getHp() <= 0 && enemy.getHp() > 0) {

                System.out.println("\nYou lost... you have returned to the 1st floor and lost 20 experience points");
                character.setExp(character.getExp() - 20);
                floor = 1;
                character.setHp(maxHP);
            }

            if (character.getHp() <= 0 && enemy.getHp() <= 0) {

                System.out.println("\nYou knocked each other out! Before he rises, you sneak back to the 1st floor");
                floor = 1;
                character.setHp(maxHP);

            } else {
                int xpRecieved = character.getExp() + enemy.getExp();

                character.setExp(xpRecieved);

                System.out.println("\nYou won! You gained " + enemy.getExp() + " experience points");
                System.out.println("You have " + character.getExp() + " experience points and need " + expNeeded + " experience points to level up!");

            }

            currentHP = character.getHp();

            if (currentHP <= 0.15 * maxHP && currentHP > 0) {

                System.out.println("\n You're below 15% health! You go back to the 1st floor to heal");
                floor = 1;
                character.setHp(maxHP);

            }

            if (character.getExp() > expNeeded && floor == 1) {

                expNeeded *= 1.5;
                newHP = character.getHp() + 500;
                newDmg = character.getPhysicalDmg() + 50;

                if (character.getRole().equals("Jedi")) {
                    newForce = character.getForce() + 25;
                    newSpecialDmg = character.getSpecialDmg() + 25;

                }

                newSpeed = character.getSpeed() + 10;

                characterLevel++;

                character.setLevel(characterLevel);
                character.setHp(newHP);
                character.setForce(newForce);
                character.setPhysicalDmg(newDmg);
                character.setSpecialDmg(newSpecialDmg);
                character.setSpeed(newSpeed);
                maxHP = character.getHp();

                System.out.println("\n You leveled up! You're now " + characterLevel + " and your new stats are: \n Health: " + newHP + "\n Force:  " + newForce + "\n Physical Damage: "
                                                                                                                                                                                    + newDmg
                                                                                                                                                                                    + "\n Speed: "
                                                                                                                                                                                    + newSpeed);

            }

        }

        if (character.getHp() < 0) {

            System.out.println("\nYou died!!");

        } else if (floor == 50) {

            System.out.println("\nYou have reached Floor 50 of the Imperial Citadel, the throne room awaits! You enter slowly and find The Emperor waiting for you.");

            FinalBoss finalBoss = FinalBoss.getInstance();

            System.out.println("\nHe calls out to you and speaks:");
            finalBoss.sayIntroPhrase();

            System.out.println("\nBattle begins!!!");

            int finalBossRemainingHealth = FinalBoss.getHp();

            while (character.getHp() > 0 && finalBossRemainingHealth > 0) {

                int remainingPlayerHealth = character.getHp() - FinalBoss.getDamage() - character.getLevel() / 2;
                int bossDamage = FinalBoss.getDamage() + character.getLevel() / 2;

                character.setHp(remainingPlayerHealth);

                System.out.println("\nThe Emperor attacks you for " + bossDamage + " damage and you have " + character.getHp() + " health left.");

                finalBossRemainingHealth = finalBossRemainingHealth - character.getPhysicalDmg();
                System.out.println("You attacked The Emperor for " + character.getPhysicalDmg() + " damage! They now have " + finalBossRemainingHealth + " health left!");

            }

        }

        if (character.getHp() <= 0) {

            System.out.println("\nYou have fallen to the Emperor... all hope is lost!");

        } else {

            System.out.println("\nYou have vanquished The Emperor! You have restored balance to the force!");

            System.out.println("\nYou have won! Your final stats were:");

            int healthPoints = character.getHp();
            int force = character.getForce();
            int physicalDmg = character.getPhysicalDmg();
            int specialDmg = character.getSpecialDmg();
            int speed = character.getSpeed();
            int level = character.getLevel();
            int exp = character.getExp();

            System.out.println("Health: " + healthPoints);
            System.out.println("Force: " + force);
            System.out.println("Physical Damage: " + physicalDmg);
            System.out.println("Special Damage: " + specialDmg);
            System.out.println("Speed: " + speed);
            System.out.println("Level: " + level);
            System.out.println("Experience: " + exp);
        }
    }

}
