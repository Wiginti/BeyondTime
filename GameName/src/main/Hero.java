package main;

public class Hero {
	
	private int healthPoint;
	private String name;
	private Bag bag;
	
	public Hero() {
		this.bag = new Bag();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}
	
	public int getHealth() {
		return this.healthPoint;
	}
	
	public Bag getBag() {
		return this.bag;
	}

}
