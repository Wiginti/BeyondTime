package main;

import java.util.Arrays;
import java.util.List;

public class World {
	
	private static final List<String> locationNames = Arrays.asList("name1", "name2", "name3", "name4", "name5");
	public static World myWorld = new World();
	private Location[] locations;
	
	public static final int NUMBER_LOCATIONS = 5;
	
	private World() {
		this.locations = new Location[NUMBER_LOCATIONS];
		for(int i = 0; i < World.NUMBER_LOCATIONS; i++) {
			locations[i] = new Location(i, World.locationNames.get(i));
		}
	}
	
	public static World getWorld() {
		return World.myWorld;
	}

}
