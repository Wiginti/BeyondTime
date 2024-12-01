package game.map;

import java.util.Arrays;
import java.util.List;

import game.entities.Hero;

public class World {
	
    // List of location names
    private static final List<String> locationNames = Arrays.asList(
        "Prehistory",
        "Antiquity",
        "Middle Ages",
        "Renaissance",
        "Contemporary Era"
    );

    // List of corresponding location descriptions
    private static final List<String> locationDescriptions = Arrays.asList(
        "A wild land full of mammoths and early humans.",
        "An age of great empires and philosophers.",
        "A time of knights, castles, and feudal lords.",
        "A flourishing period of arts and scientific discovery.",
        "A modern world of technology and skyscrapers."
    );
	public static World myWorld = new World("null");
	private static Location[] locations;
	private static Hero hero;
	
	public static final int NUMBER_LOCATIONS = 5;
	
	private World(String myName) {
		World.locations = new Location[NUMBER_LOCATIONS];
		for(int i = 0; i < World.NUMBER_LOCATIONS; i++) {
			locations[i] = new Location(World.locationNames.get(i), World.locationDescriptions.get(i));
		}
		World.hero = new Hero(myName);
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
