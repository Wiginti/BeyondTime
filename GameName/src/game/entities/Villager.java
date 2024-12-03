package game.entities;

public class Villager extends Entity implements Interactable {
	
	public static final int DEFAULT_HEALTHPOINT = 50;
	
	private String name;
	private int healthPoint;
	
	public Villager(String name) {
		this.name = name;
		this.healthPoint = Villager.DEFAULT_HEALTHPOINT;
	}

}
