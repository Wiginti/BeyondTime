package game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import game.entities.Bag;
import game.entities.Item;
import game.entities.Potion;

class BagIT {
	
	private Bag myBag;
	private Item myItem;
	
	@Before
	public void setUp() {
		myBag = new Bag();
		myItem = new Potion();
	}

	@Test
	void testBag() {
		Bag myNewBag = new Bag();
		assertNotNull(myNewBag);
	}

	@Test
	public void testAddItem() {
		myBag.addItem(myItem);
	}

	@Test
	void testRemoveItem() {
		fail("Not yet implemented");
	}

}
