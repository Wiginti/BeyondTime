package game.entities;

import java.util.ArrayList;
import java.util.List;

public class Safe extends Item implements Containable {
	
	private int size;
	
	public static final int MAX_ITEMS = 5;

	private Key key;
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public Safe() {
		this.key = new Key();
		this.size = 0;
	}
	
	public Key getKey() {
		return this.key;
	}
	
	@Override
	public List<Item> getItems() {
		return items;
	}
	
	@Override
	public void addItem(Item item) {
		if(this.size < Bag.MAX_ITEMS) {
			items.add(item);	
			this.size++;
		}
	}
	
	@Override
	public void removeItem(Item item) {
		if(items.contains(item)) {
			items.remove(item);
			this.size--;
		}
	}
	
	@Override
	public Item getItemByName(String name) {
		for(Item item : this.items) {
			if(item.getClass().getName().equals(name)) {
				return item;
			}
		}
		return null;
	}
	
	@Override
	public void displayItems() {
		try {
			System.out.println("List of items available in this Safe :");
			for(Item item : this.items) {
				System.out.println("- " + item.getClass().getSimpleName());
			}
		} catch (Exception e) {
			System.out.println("There is no item in this Safe");
		}
	}
	
}
