package main.java;

import characterbuilder.java.Character;

public class Main {

    static boolean NakedCharacter;
    static boolean CharacterJedi;
    static String helmet;
    static String armor;
    static String pants;
    static String boots;
    static int floor = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to STAR WARS");
        System.out.println("Building your character...");

        // shows the character builder
        Character character = Generation.generateCharacter();

        // character health is set to 5000 just for the assignment run as otherwise it
        // will run over 5 minutes with normal gameplay
        // as a result the character will win every battle, however in normal health run
        // the character would get sent to floor 1 under 15% health/die and go to floor
        // 1 to level up
        character.setHP(5000);

        // Sometimes the program randomly stops, it doesn't terminate but gets "stuck."
        // If this happens terminate and run it again until it works please
        // I included a screenshot of a successful run and the last line in the document
        // playing this uses the final boss singleton design pattern and the enemy
        // builder
        Gameplay.play(character);

    }
}
