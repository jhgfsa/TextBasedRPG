package main.java;

import enemyfactory.java.Enemy;

public class Gameplay {

    static int floor = 1;
    static int remainingPlayerHealth;

    public static void play(characterbuilder.java.Character character) {

        System.out.println("\n\nNow entering the Imperial Citadel, Floor 1...");

        while (character.getHP() > 0 && floor != 11) {

            Enemy enemy = Generation.generateEnemy(floor);
            String enemyName = enemy.getName();
            int remainingEnemyHealth = enemy.getHP();

            System.out.println("\nYou enter floor " + floor + " and encounter " + enemyName + "!");

            floor++;

            while (character.getHP() > 0 && remainingEnemyHealth > 0) {

                if (character.getSpeed() > enemy.getSpeed()) {

                    remainingEnemyHealth = remainingEnemyHealth - character.getPhysicalDmg();
                    System.out.println("You attacked " + enemy.getName() + " for " + character.getPhysicalDmg()
                            + " damage! They now have " + remainingEnemyHealth + " health left!");

                    int remainingPlayerHealth = character.getHP() - enemy.getPhysicalDmg();

                    character.setHP(remainingPlayerHealth);

                    System.out.println(enemy.getName() + "attacked you for " + enemy.getPhysicalDmg()
                            + " and you now have " + character.getHP() + " health remaining!");

                }

                if (character.getSpeed() < enemy.getSpeed()) {

                    remainingPlayerHealth = character.getHP() - enemy.getPhysicalDmg();

                    character.setHP(remainingPlayerHealth);

                    System.out.println(enemy.getName() + " attacked you for " + enemy.getPhysicalDmg()
                            + " and you now have " + character.getHP() + " health remaining!");

                    remainingEnemyHealth = remainingEnemyHealth - character.getPhysicalDmg();
                    System.out.println("You attacked " + enemy.getName() + " for " + character.getPhysicalDmg()
                            + " damage! They now have " + remainingEnemyHealth + " health left!");

                }

            }

        }

        if (character.getHP() < 0) {

            System.out.println("\nYou died!!");
        }

        else if (floor == 11) {
            System.out.println("\nYou got to floor 11! YOU WIN!!!");

        }

    }

}
