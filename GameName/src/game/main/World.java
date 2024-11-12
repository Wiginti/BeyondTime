package game.main;

import java.util.Arrays;
import java.util.List;

import game.entities.Hero;

public class World {
	
	private static final List<String> locationNames = Arrays.asList("name1", "name2", "name3", "name4", "name5");
	public static World myWorld = new World("null");
	private static Location[] locations;
	private static Hero hero;
	
	public static final int NUMBER_LOCATIONS = 5;
	
	private World(String myName) {
		World.hero = new Hero(myName);
		World.locations = new Location[NUMBER_LOCATIONS];
		for(int i = 0; i < World.NUMBER_LOCATIONS; i++) {
			locations[i] = new Location(World.locationNames.get(i));
		}
	}
	
	public static World getWorld() {
		return World.myWorld;
	}
	
	public Hero getHero() {
		return World.hero;
	}
	
	public Location[] getLocations(){
		return World.locations;
	}
	
	public Location getLocation(int index) {
		return World.locations[index];
	}

}
