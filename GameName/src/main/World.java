package main;

public class World {
	
	public static World myWorld = new World();
	private Location[] locations;
	
	public static final int NUMBER_LOCATIONS = 5;
	
	private World() {
		this.locations = new Location[NUMBER_LOCATIONS];
		for(int i = 0; i < World.NUMBER_LOCATIONS; i++) {
			locations[i] = new Location(i);
		}
		
	}
	
	public World getWorld() {
		return World.myWorld;
	}

}
