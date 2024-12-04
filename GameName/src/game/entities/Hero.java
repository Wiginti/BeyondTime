package game.entities;

import game.map.Location;

public class Hero extends Entity implements Fightable {
	
	private int damageAmount;
	private Bag bag;
	private Location heroLocation;
	
	public static final int DEFAULT_HEALTH = 100;
	public static final int DEFAULT_DAMAGE = 25;
	
    public Hero() {
        super(Hero.DEFAULT_HEALTH, "");
        this.damageAmount = DEFAULT_DAMAGE;
        this.heroLocation = null;
        this.bag = new Bag();
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
	
	//getter damageAmount
	
	@Override
	public int getDamage() {
		return this.damageAmount;
	}
	
	public void addDamage(int amount) {
		this.damageAmount += amount;
	}

	@Override
	public void attack(Entity entity) {
		entity.removeHealth(this.damageAmount);
	}
	

}
