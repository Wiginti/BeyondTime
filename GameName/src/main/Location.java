package main;

import java.util.List;

public class Location {

	private int level;
	private List<Item> items;
	private List<Character> characters;
	private String name;
	
	public Location(int myLevel, String myName) {
		this.level = myLevel;
		this.name = myName;
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
	
	public String getName() {
		return this.name;
	}
	
}
