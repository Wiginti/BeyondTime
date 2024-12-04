package game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import game.entities.Potion;

public class PotionIT {

	    @Test
	    void testConstructorWithAmount() {
	        Potion potion = new Potion(30);
	        assertNotNull(potion);
	        assertEquals(30, potion.getHealthAmount(), "La quantité de santé devrait être initialisée correctement");
	    }

	    @Test
	    void testDefaultConstructor() {
	        Potion potion = new Potion();
	        assertNotNull(potion);
	        assertEquals(50, potion.getHealthAmount(), "La quantité de santé par défaut devrait être 50");
	    }

	    @Test
	    void testToString() {
	        Potion potion = new Potion();
	        assertEquals("Potion", potion.toString(), "La méthode toString devrait retourner 'Potion'");
	    }
	}
