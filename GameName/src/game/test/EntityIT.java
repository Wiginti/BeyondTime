package game.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import game.entities.Entity;

public class EntityIT {
    
    @Test
    public void testGetHealth() {
        
        Entity entity = new Entity() {};
        entity.setHealth(100);

       
        int health = entity.getHealth();

        
        assertEquals(100, health, "Health points should be 100");
    }

    @Test
    public void testRemoveHealth() {
        
        Entity entity = new Entity() {};
        entity.setHealth(100);

        entity.removeHealth(20);

        assertEquals(80, entity.getHealth(), "Health points should be reduced by 20");
    }

    @Test
    public void testAddHealth() {
        
        Entity entity = new Entity() {};
        entity.setHealth(80);
        
        entity.addHealth(20);

        
        assertEquals(100, entity.getHealth(), "Health points should be increased by 20");
    }

    @Test
    public void testSetHealth() {
        
        Entity entity = new Entity() {};

        entity.setHealth(50);

        assertEquals(50, entity.getHealth(), "Health points should be set to 50");
    }

    @Test
    public void testGetName() {
        
        Entity entity = new Entity() {};
        entity.changeName("TestName");
        
        String name = entity.getName();
        
        assertEquals("TestName", name, "Name should be 'TestName'");
    }

    @Test
    public void testChangeName() {
        
        Entity entity = new Entity() {};
        entity.changeName("OldName");

        entity.changeName("NewName");

        assertEquals("NewName", entity.getName(), "Name should be updated to 'NewName'");
    }

}
