package game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import game.entities.Bag;
import game.map.Location;

class LocationIT {

	private Location location1;
	private Bag bag1;
	
	@Before
	public void setUp() {
		location1 = new Location("Prehistory");
		bag1 = new Bag();
	}
	
	@Test
	public void testAddItem() {
		location1.addItem(bag1);
		assertTrue(location1.isItemInLocation(bag1));
	}
	
	@Test
	public void testRemoveItem() {
		location1.removeItem(bag1);
		assertFalse(location1.isItemInLocation(bag1));
	}

}
