package game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.entities.Villager;

public class VillagerIT{

    private Villager villager;
    private final String TEST_NAME = "TestName";

    @BeforeEach
    public void setUp() {
        villager = new Villager(0, TEST_NAME);
    }

    @Test
    public void testConstructor_initializesNameCorrectly() {
        assertEquals(TEST_NAME, villager.getName(), "Le nom doit être initialisé correctement.");
    }

    @Test
    public void testConstructor_initializesHealthPointCorrectly() {
        assertEquals(Villager.DEFAULT_HEALTHPOINT, villager.getHealth(), "Les points de vie doivent être initialisés à la valeur par défaut.");
    }

    @Test
    public void testSetHealthPoint_updatesHealthCorrectly() {
        int newHealth = 30;
        villager.setHealth(newHealth);
        assertEquals(newHealth, villager.getHealth(), "Les points de vie doivent être mis à jour correctement.");
    }

    @Test
    public void testSetHealthPoint_handlesNegativeHealth() {
        int negativeHealth = -10;
        villager.setHealth(negativeHealth);
        assertTrue(villager.getHealth() >= 0, "Les points de vie ne doivent pas être inférieurs à zéro.");
    }
}