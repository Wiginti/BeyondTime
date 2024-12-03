package game.entities;

import game.map.Location;

public class Hero extends Entity implements Fightable {
	
	private int healthPoint;
	private int damageAmount;
	private String name;
	private Bag bag;
	private Location heroLocation;
	
	public static final int DEFAULT_HEATLH = 100;
	
	public Hero() {
		this.healthPoint = Hero.DEFAULT_HEATLH;
		this.name = "";
		this.bag = new Bag();
		this.heroLocation = null;
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
	
	//getter health
	public int getHealth() {
		return this.healthPoint;
	}
	
	//getter damageAmount
	
	public int getDamage() {
		return this.damageAmount;
	}
	
	

}
