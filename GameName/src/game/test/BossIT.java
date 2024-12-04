package game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.entities.Boss;

class BossIT {

    @Test
    void testGetHealth() {
        
        int expectedHealth = 100;
        Boss boss = new Boss(expectedHealth, 20, "BossName");

        int actualHealth = boss.getHealth();

        assertEquals(expectedHealth, actualHealth, "The health should match the expected value.");
    }

    @Test
    void testGetName() {
        
        Boss boss = new Boss(100, 20, null);

        String actualName = boss.getName();

        assertNull(actualName, "The name should initially be null, as it's not set in the constructor.");
    }

    @Test
    void testBoss() {
   
        int expectedHealth = 150;
        int expectedDamage = 50;

        Boss boss = new Boss(expectedHealth, expectedDamage, "BossName");

        assertNotNull(boss, "The boss object should not be null after instantiation.");
        assertEquals(expectedHealth, boss.getHealth(), "The health should match the value provided to the constructor.");
        assertEquals(expectedDamage, boss.getDamage(), "The damage should match the value provided to the constructor.");
    }

    @Test
    void testGetDamage() {

        int expectedDamage = 30;
        Boss boss = new Boss(100, expectedDamage, "BossName");

        int actualDamage = boss.getDamage();

        assertEquals(expectedDamage, actualDamage, "The damage should match the expected value.");
    }
}