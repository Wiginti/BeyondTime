package game.entities;

import java.util.ArrayList;
import java.util.List;

public class Safe extends Item implements Openable {

	private Key key;
	private ArrayList<Item> items;
	
	public Safe() {
		this.key = new Key();
	}
	
	public Key getKey() {
		return this.key;
	}
	
	@Override
	public List<Item> getItems() {
		return items;
	}
	
}
