package game.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import game.entities.Entity;
import game.entities.Item;

public class Location {
	
	private String name;
	private ArrayList<Item> items = new ArrayList<Item>();
	private String description;
	private List<Entity> entities;
	private Map<String, Exit> exits;
	
	public Location(String myName, String description) {
		this.name = myName;
		this.exits = new HashMap<String, Exit>();
		this.description = description;
	}
	
	//Getter and setter for exits
	
	public void addExit(String neighborName, Exit exit) {
        this.exits.put(neighborName, exit);
    }
	
	public Exit getExit(String exitName) {
		return this.exits.get(exitName);
    }
	
	public void displayExits() {
		if(exits.entrySet() != null) {
	        System.out.println("Exits from " + this.name + ":");
	        for (Entry<String, Exit> neighbor : exits.entrySet()) {
	            System.out.println(" - " + neighbor.getValue().getName());
	        }	
		} else {
			System.out.println("There is no exit in this Location");
		}
    }
	
	//getter description
	public String getDescription() {
		return this.description;
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
			System.out.println("List of items available in this Location :");
			for(Item item : this.items) {
				System.out.println("- " + item.getClass().getSimpleName());
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
			if(item.getClass().getSimpleName().equals(name)) {
				return item;
			}
		}
		return null;
	}
	
	public Entity getEntityByName() {
		for(Entity entity : this.entities) {
			if(entity.getName().equals(name)) {
				return entity;
			}
		}
		return null;
	}
	
	//Getter and setter for Characters
	
	public void addEntity(Entity entity) {
		entities.add(entity);
	}
	
	public void removeEntity(Entity entity) {
		entities.remove(entity);
	}
	
	public List<Entity> getEntities(){
		return this.entities;
	}
	
	public void displayEntities() {
		try {
			System.out.println("List of characters available in this Location :");
			for(Entity entity : this.entities) {
				System.out.println("- " + entity.getClass().getName());
			}
		} catch (Exception e) {
			System.out.println("There is no character in this Location");
		}
	}
	
	public Entity getEntityByName(String name) {
	    for (Entity entity : this.entities) {
	        if (entity.getName().equals(name)) {
	            return entity;
	        }
	    }
	    return null;
	}
	
	//Getter for Name
	
	public String getName() {
		return this.name;
	}
	
}
