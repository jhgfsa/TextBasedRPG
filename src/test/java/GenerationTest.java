package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Generation;
import main.java.enemyfactory.Enemy;

public class GenerationTest {

    int floor;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGenerateEnemyMedium() {

        floor = 5;

        Enemy enemy = Generation.generateEnemy(floor);

        int expectedHp = 60;

        assertEquals(expectedHp, enemy.getHp());

    }

    @Test
    public void testGenerateEnemySmall() {

        floor = 6;

        Enemy enemy = Generation.generateEnemy(floor);

        int expectedHp = 30;
        assertEquals(expectedHp, enemy.getHp());

    }

    @Test
    public void testGenerateEnemyBoss() {

        floor = 10;

        Enemy enemy = Generation.generateEnemy(floor);

        int expectedHp = 90;
        assertEquals(expectedHp, enemy.getHp());

    }

    @Test
    public void testGenerateCharacterJedi() {

        main.java.characterbuilder.Character character = Generation.generateCharacter();

        character.setRole("Jedi");
        character.setSpecies("Human");
        String equipment = Generation.generateEquipment(character.getSpecies(), character.getRole());
        character.setArmor(equipment);

        String expected = "JediRobes";

        assertEquals(expected, character.getArmor());

    }

}
