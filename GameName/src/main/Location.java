package main;

import java.util.List;

public class Location {

	private int level;
	private List<Item> items;
	private List<Character> characters;
	
	public Location(int myLevel) {
		this.level = myLevel;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void addCharacter(Character character) {
		characters.add(character);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public void removeCharacter(Character character) {
		characters.remove(character);
	}
	
}
