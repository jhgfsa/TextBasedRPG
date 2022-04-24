package main.java;

import main.java.characterbuilder.Character;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to STAR WARS");
        System.out.println("\nBuilding your character...");

        // shows the character builder
        Character character = Generation.generateCharacter();

        // playing this uses the final boss singleton design pattern and the enemy
        // builder
        Gameplay.play(character);

    }
}
