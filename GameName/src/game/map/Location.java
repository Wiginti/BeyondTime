package game.map;
import java.util.List;

import game.entities.Item;

public class Location {

	private List<Item> items;
	private List<Character> characters;
	private String name;
	
	public Location(String myName) {
		this.name = myName;
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
	
	public List<Exit> getExits(){
		
	}
	
}
