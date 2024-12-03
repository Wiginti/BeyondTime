package game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import game.entities.Potion;
import game.map.Location;

class LocationIT {

	private Location location1;
	private Potion potion1;
	
	@Before
	public void setUp() {
		location1 = new Location("Prehistory", "A wild land full of mammoths and early humans.");
		potion1 = new Potion();
	}
	
	@Test
	public void testAddItem() {
		location1.addItem(potion1);
		assertTrue(location1.isItemInLocation(potion1));
	}
	
	@Test
	public void testRemoveItem() {
		location1.removeItem(potion1);
		assertFalse(location1.isItemInLocation(potion1));
	}

}
