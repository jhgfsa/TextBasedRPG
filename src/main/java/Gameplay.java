package main.java;

import main.java.bosssingleton.FinalBoss;
import main.java.enemyfactory.Enemy;

public class Gameplay {

    static int floor = 1;

    private static int expNeeded = 100;
    private static int characterLevel = 1;
    private static int newHP;
    private static int newForce;
    private static int newSpecialDmg;
    private static int newSpeed;
    private static int currentHP;
    private static int maxHP;

    public static void play(main.java.characterbuilder.Character character) {

        maxHP = character.getHP();

        System.out.println("\n\nNow entering the Imperial Citadel, Floor 1...");

        while (character.getHP() > 0 && floor != 50) {

            Enemy enemy = Generation.generateEnemy(floor);
            String enemyName = enemy.getName();
            int remainingEnemyHealth = enemy.getHP();

            System.out.println("\nYou enter floor " + floor + " and encounter " + enemyName + "!");

            floor++;

            while (character.getHP() > 0 && remainingEnemyHealth > 0) {

                if (character.getSpeed() >= enemy.getSpeed()) {

                    remainingEnemyHealth = remainingEnemyHealth - character.getPhysicalDmg();
                    System.out.println("You attacked " + enemy.getName() + " for " + character.getPhysicalDmg()
                            + " damage! They now have " + remainingEnemyHealth + " health left!");

                    int remainingPlayerHealth = character.getHP() - enemy.getPhysicalDmg();
                    remainingPlayerHealth = remainingPlayerHealth - character.getLevel() / 2;
                    int bossDamage = enemy.getPhysicalDmg() + character.getLevel() / 2;

                    character.setHP(remainingPlayerHealth);

                    System.out.println(enemy.getName() + " attacked you for " + bossDamage + " damage and you now have "
                            + character.getHP() + " health remaining!");

                }

                if (character.getSpeed() <= enemy.getSpeed()) {

                    int remainingPlayerHealth = character.getHP() - enemy.getPhysicalDmg();
                    remainingPlayerHealth = remainingPlayerHealth - character.getLevel() / 2;
                    int bossDamage = enemy.getPhysicalDmg() + character.getLevel() / 2;

                    character.setHP(remainingPlayerHealth);

                    System.out.println(enemy.getName() + " attacked you for " + bossDamage + " and you now have "
                            + character.getHP() + " health remaining!");

                    remainingEnemyHealth = remainingEnemyHealth - character.getPhysicalDmg();
                    System.out.println("You attacked " + enemy.getName() + " for " + character.getPhysicalDmg()
                            + " damage! They now have " + remainingEnemyHealth + " health left!");

                }

            }

            if (character.getHP() <= 0 && enemy.getHP() > 0) {

                System.out.println("\nYou lost... you have returned to the 1st floor and lost 20 experience points");
                character.setExp(character.getExp() - 20);
                floor = 1;
                character.setHP(maxHP);
            }

            if (character.getHP() <= 0 && enemy.getHP() <= 0) {

                System.out.println("\nYou knocked each other out! Before he rises, you sneak back to the 1st floor");
                floor = 1;
                character.setHP(maxHP);
            }

            int XPRecieved = character.getExp() + enemy.getExp();

            character.setExp(XPRecieved);

            System.out.println("\nYou won! You gained " + enemy.getExp() + " experience points");
            System.out.println("You have " + character.getExp() + " experience points and need " + expNeeded
                    + " experience points to level up!");

            currentHP = character.getHP();

            if (currentHP <= 0.15 * maxHP && currentHP > 0) {

                System.out.println("\n You're below 15% health! You go back to the 1st floor to heal");
                floor = 1;
                character.setHP(maxHP);

            }

            if (character.getExp() > expNeeded && floor == 1) {

                expNeeded *= 1.5;
                newHP = character.getHP() + 25;

                if (character.getRole().equals("Jedi")) {
                    newForce = character.getForce() + 25;
                    newSpecialDmg = character.getSpecialDmg() + 25;

                }

                newSpeed = character.getSpeed() + 10;

                characterLevel++;

                character.setLevel(characterLevel);
                character.setHP(newHP);
                character.setForce(newForce);
                character.setSpecialDmg(newSpecialDmg);
                character.setSpeed(newSpeed);
                maxHP = character.getHP();

                System.out.println("\n You leveled up! You're now " + characterLevel
                        + " and your new stats are: \n Health: " + newHP + "\n Force:  " + newForce
                        + "\n Special Damage: " + newSpecialDmg + "\n Speed: " + newSpeed);

            }

        }

        if (character.getHP() < 0) {

            System.out.println("\nYou died!!");
        }

        else if (floor == 50) {

            System.out.println(
                    "\nYou have reached Floor 50 of the Imperial Citadel, the throne room awaits! You enter slowly and find The Emperor waiting for you.");

            FinalBoss finalBoss = FinalBoss.getInstance();

            System.out.println("\nHe calls out to you and speaks:");
            finalBoss.sayIntroPhrase();

            System.out.println("\nBattle begins!!!");

            int finalBossRemainingHealth = FinalBoss.getHP();

            while (character.getHP() > 0 && finalBossRemainingHealth > 0) {

                int remainingPlayerHealth = character.getHP() - FinalBoss.getDamage() - character.getLevel() / 2;
                int bossDamage = FinalBoss.getDamage() + character.getLevel() / 2;

                character.setHP(remainingPlayerHealth);

                System.out.println("\nThe Emperor attacks you for " + bossDamage + " damage and you have "
                        + character.getHP() + " health left.");

                finalBossRemainingHealth = finalBossRemainingHealth - character.getPhysicalDmg();
                System.out.println("You attacked The Emperor for " + character.getPhysicalDmg()
                        + " damage! They now have " + finalBossRemainingHealth + " health left!");

            }

        }

        if (character.getHP() <= 0) {

            System.out.println("\nYou have fallen to the Emperor... all hope is lost!");
        }

        else {

            System.out.println("\nYou have vanquished The Emperor! You have restored balance to the force!");
        }
    }

}
