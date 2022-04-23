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

        Gameplay.play(character);

    }
}
