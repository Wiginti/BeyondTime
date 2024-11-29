package game.entities;

public class Boss extends Entity implements Interactable, Fightable {
	
	private String name;
	private int healthPoint;
	
	public Boss(int healthPoint) {
		this.healthPoint = healthPoint;
	}
	
}
