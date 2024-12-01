package game.entities;

public class Boss extends Entity implements Interactable, Fightable {
	
	private String name;
	private int healthPoint;
	private int damageAmount;
	
	public Boss(int healthPoint, int damageAmount) {
		this.healthPoint = healthPoint;
		this.damageAmount = damageAmount;
	}
	
	public int getDamage() {
		return this.damageAmount;
	}
	
	public int getHealth() {
		return this.healthPoint;
	}
	
	public String getName() {
		return this.name;
	}
	
}
