package test.java;

import static org.junit.Assert.assertEquals;

import main.java.Generation;
import main.java.enemyfactory.Enemy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class GenerationTest {

    int floor;

    @Before
    public void setUp() throws Exception {

        floor = 5;

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGenerateEnemyMedium() {

        Enemy enemy = Generation.generateEnemy(floor);

        int expectedHp = 60;

        assertEquals(enemy.getHp(), expectedHp);

    }

}
