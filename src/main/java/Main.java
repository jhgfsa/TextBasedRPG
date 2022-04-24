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

        Character character = Generation.generateCharacter();

        // character health is set to 5000 just for the assignment run as otherwise it
        // will run over 5 minutes with normal gameplay
        // as a result the character will win every battle, however if I didn't do this
        // the character would
        // get sent to floor 1 under 15% health/die and go to floor 1
        character.setHP(5000);

        Gameplay.play(character);

    }
}
