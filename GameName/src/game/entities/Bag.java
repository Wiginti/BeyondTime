package game.entities;

import java.util.ArrayList;

public class Bag extends Item {
	
	private int size;
	
	public static final int MAX_ITEMS = 5;
	private ArrayList<Item> items;
	
	public Bag() {
		this.size = 0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public ArrayList<Item> getItems(){
		return this.items;
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
