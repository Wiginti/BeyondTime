package game.map;
import java.util.List;
import java.util.Map;

import game.entities.Item;

public class Location {
	
	private String name;
	private List<Item> items;
	private List<Character> characters;
	private Map<String, Exit> exits;
	
	public Location(String myName) {
		this.name = myName;
	}
	
	//Getter and setter for exits
	
	public void addExit(String neighborName, Exit exit) {
        exits.put(neighborName, exit);
    }
	
	public Exit getExit(String neighborName) {
        return exits.get(neighborName);
    }
	
	public void displayExits() {
        System.out.println("Exits from " + name + ":");
        for (String neighbor : exits.keySet()) {
            System.out.println(" - " + neighbor);
        }
    }
	
	//Getter and setter for Items
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public List<Item> getItems(){
		return this.items;
	}
	
	public void displayItems() {
		try {
			for(Item item : this.items) {
				System.out.println("List of items available in this Location :");
				System.out.println("- " + item.getClass().getName());
			}
		} catch (Exception e) {
			System.out.println("There is no item in this Location");
		}
	}
	
	public boolean isItemInLocation(Item item) {
		return this.items.contains(item);
	}
	
	public Item getItemByName(String name) {
		for(Item item : this.items) {
			if(item.getClass().getName().equals(name)) {
				return item;
			}
		}
		return null;
	}
	
	//Getter and setter for Characters
	
	public void addCharacter(Character character) {
		characters.add(character);
	}
	
	public void removeCharacter(Character character) {
		characters.remove(character);
	}
	
	public List<Character> getCharacters(){
		return this.characters;
	}
	
	public void displayCharacters() {
		try {
			for(Character character : this.characters) {
				System.out.println("List of characters available in this Location :");
				System.out.println("- " + character.getClass().getName());
			}
		} catch (Exception e) {
			System.out.println("There is no character in this Location");
		}
	}
	
	//Getter for Name
	
	public String getName() {
		return this.name;
	}
	
}
