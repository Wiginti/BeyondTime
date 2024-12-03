package game.commandes;

import game.entities.Hero;
import game.map.Exit;
import game.map.Location;
import game.map.World;

public class GoCommand implements Command {

	@Override
	public void onExecute(String[] args) {
		Hero hero = World.getWorld().getHero();
		Location currentLoc = hero.getHeroLocation();
		String nameLoc = currentLoc.getName();
		if(args.length == 0) {
			System.out.println("Usage : go [destination]");
		} else if (args.length >= 1) {
			String destinationName = args[0];
			for(int i = 1; i < args.length; i++) {
				destinationName += " " + args[i];
			}
			Exit exitName = currentLoc.getExit(destinationName);
			
			if(exitName != null) {
				Location destination = exitName.getDestination();
				System.out.println("You move to " + destination.getName());
				hero.setHeroLocation(destination);
			} else {
				System.out.println("This Exit doesn't exist !");
			}
			
		}
	}

}
