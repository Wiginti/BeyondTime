package game.entities;

public abstract class Entity {
	
	private int healthPoint;
	private String name;
	
	//Getter and Setter for Health
	
	public int getHealth() {
		return this.healthPoint;
	}
	
	public abstract void removeHealth(int amount);
	
	public void addHealth(int amount) {
		this.healthPoint += amount;
	}
	
	public void setHealth(int amount) {
		this.healthPoint = amount;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}

}
