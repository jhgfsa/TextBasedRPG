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

        // character health is set to 3000 just for the assignment run as otherwise it
        // will run over 5 minutes with normal gameplay
        // as a result the character will win every battle, however in normal health run
        // the character would get sent to floor 1 under 15% health/die and go to floor
        // 1 to level up
        // there is also enemy scaling with normal gameplay as it is based off player
        // level but in this demo you never level up so enemies dont scale
        character.setHp(3000);

        // playing this uses the final boss singleton design pattern and the enemy
        // builder
        Gameplay.play(character);

    }
}
