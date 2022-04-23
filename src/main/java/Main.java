package main.java;

import characterbuilder.java.Character;

public class Main {

    static boolean NakedCharacter;
    static boolean CharacterJedi;
    static String helmet;
    static String armor;
    static String pants;
    static String boots;

    public static void main(String[] args) {
        System.out.println("Welcome to STAR WARS");
        System.out.println("Building your character...");

        Character character = Generation.generateCharacter();

        System.out.println("\n\nNow entering the Imperial Citadel, Floor 1...");

    }
}
