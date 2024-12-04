package game.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import game.entities.Bag;
import game.entities.Hero;

public class HeroIT {
    
    @Test
    void testHeroConstructor() {
        
        String expectedName = "TestHero";
        int expectedHealthPoint = Hero.DEFAULT_HEALTH;

        
        Hero hero = new Hero();

        
        assertEquals(expectedName, hero.getName(), "Hero name should match the expected name.");
        assertEquals(expectedHealthPoint, hero.getHealth(), "Hero health points should match the default value.");
        assertNotNull(hero.getBag(), "Hero bag should not be null.");
        assertNotNull(hero.getHeroLocation(), "Hero location should not initially be null.");
    }

    @Test
    void testGetBag() {
        
        Hero hero = new Hero();

        
        Bag bag = hero.getBag();

        
        assertNotNull(bag, "The bag should not be null.");
    }
    
}
