package game.entities;

import java.util.ArrayList;
import java.util.List;

public class Bag extends Item implements Containable {
	
	private int size;
	
	public static final int MAX_ITEMS = 5;
	private ArrayList<Item> items;
	
	public Bag() {
		this.size = 0;
		this.items = new ArrayList<Item>();
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
	
	public void displayItems() {
		try {
			System.out.println("List of items available in your Bag :");
			for(Item item : this.items) {
				System.out.println("- " + item.getClass().getSimpleName());
			}
		} catch (Exception e) {
			System.out.println("There is no item in your Bag !");
		}
	}
	
}
