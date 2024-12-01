package game.map;

public class Exit {
	
	private String name;
	private Location destination;
	
	public Exit(String name, Location destination) {
		this.name = name;
		this.destination = destination;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Location getDestination() {
		return this.destination;
	}
	
}
