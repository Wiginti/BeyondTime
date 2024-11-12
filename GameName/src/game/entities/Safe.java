package game.entities;

public class Safe extends Item {

	private Key key;
	
	public Safe() {
		this.key = new Key();
	}
	
	public Key getKey() {
		return this.key;
	}
	
}
