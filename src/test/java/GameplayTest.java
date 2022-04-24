package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Gameplay;
import main.java.Generation;

public class GameplayTest {

    int floor;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testPlay() {

        main.java.characterbuilder.Character character = Generation.generateCharacter();
        character.setHp(5000);

        Gameplay.play(character);

        int expected = 1;

        assertEquals(expected, character.getLevel());

    }

}