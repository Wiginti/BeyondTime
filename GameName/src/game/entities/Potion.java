package game.entities;

public class Potion extends Item implements Usable {
	
	private int healthAmount;
	private final static int healthAmountDefault = 50;
	
	public Potion(int amount){
		this.healthAmount = amount;
	}
	
	public Potion() {
		this.healthAmount = healthAmountDefault;
	}

	@Override
	public void use(Hero hero) {
		if(hero.getHealth() + healthAmount > Hero.DEFAULT_HEATLH) {
			hero.setHealth(Hero.DEFAULT_HEATLH);
		}
		else {
			hero.addHealth(healthAmount);	
		}
	}
	
	

}
