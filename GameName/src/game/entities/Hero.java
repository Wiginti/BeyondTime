package game.entities;

public class Hero {
	
	private int healthPoint;
	private String name;
	private Bag bag;
	
	public static final int DEFAULT_HEATLH = 100;
	
	public Hero(String myName) {
		this.healthPoint = Hero.DEFAULT_HEATLH;
		this.name = myName;
		this.bag = new Bag();
		
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
	
	

}
