package game.entities;

public class Boss extends Entity implements Interactable, Fightable {
	
	private String name;
	private int healthPoint;
	private int damageAmount;
	
	public Boss(int healthPoint, int damageAmount, String name) {
		this.healthPoint = healthPoint;
		this.damageAmount = damageAmount;
		this.name = name;
	}
	
	@Override
	public void attack(Entity entity) {
		entity.removeHealth(this.damageAmount);
	}
	
	@Override
	public int getDamage() {
		return this.damageAmount;
	}
	
	public int getHealth() {
		return this.healthPoint;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public void removeHealth(int amount) {
		this.healthPoint -= amount;	
	}
	
}
