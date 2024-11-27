package game.entities;

import java.util.ArrayList;
import java.util.List;

public class Bag extends Item implements Openable {
	
	private int size;
	
	public static final int MAX_ITEMS = 5;
	private ArrayList<Item> items;
	
	public Bag() {
		this.size = 0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	@Override
	public List<Item> getItems() {
		return items;
	}
	
	public Item getItemByName(String name) {
	    if (items == null || name == null) {
	        return null;
	    }
	    for (Item item : items) {
	        if (item.getClass().getSimpleName().equalsIgnoreCase(name)) {
	            return item;
	        }
	    }
	    return null;
	}
	
	public void addItem(Item item) {
		if(this.size < Bag.MAX_ITEMS) {
			items.add(item);	
			this.size++;
		}
	}
	
	public void removeItem(Item item) {
		if(items.contains(item)) {
			items.remove(item);
			this.size--;
		}
	}
	
}
