package game.test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import game.entities.Hero;
import game.entities.Potion;

public class PotionIT {
	 private Hero hero;

	    @Before
	    void setUp() {
	        hero = new Hero();
	    }

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

	    @Test
	    void testUsePotionNotExceedingMaxHealth() {
	        Potion potion = new Potion(30);
	        int initialHealth = hero.getHealth();
	        potion.use(hero);
	        assertEquals(initialHealth + 30, hero.getHealth(), "La santé du héros devrait augmenter de 30");
	    }

	    @Test
	    void testUsePotionExceedingMaxHealth() {
	        Potion potion = new Potion(50);
	        hero.setHealth(Hero.DEFAULT_HEATLH - 10);
	        potion.use(hero);
	        assertEquals(Hero.DEFAULT_HEATLH, hero.getHealth(), "La santé du héros ne devrait pas excéder la santé maximale");
	    }
	}
