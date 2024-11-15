package game.entities;

import game.map.Location;
import game.map.World;

public class Hero {
	
	private int healthPoint;
	private String name;
	private Bag bag;
	private Location heroLocation;
	
	public static final int DEFAULT_HEATLH = 100;
	
	public Hero(String myName) {
		this.healthPoint = Hero.DEFAULT_HEATLH;
		this.name = myName;
		this.bag = new Bag();
		this.heroLocation = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}
	
	//Getter and Setter for Health
	
	public int getHealth() {
		return this.healthPoint;
	}
	
	public void removeHealth(int amount) {
		this.healthPoint -= amount;
	}
	
	public void addHealth(int amount) {
		this.healthPoint += amount;
	}
	
	//Getter for bag
	
	public Bag getBag() {
		return this.bag;
	}
	
	//Getter and and Setter for heroLocation
	
	public void setHeroLocation(Location location) {
		this.heroLocation = location;
	}
	
	public Location getHeroLocation() {
		return this.heroLocation;
	}
	
	

}
