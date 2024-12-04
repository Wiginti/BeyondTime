package game.commandes;

import game.entities.Boss;
import game.entities.Entity;
import game.entities.Hero;
import game.map.Exit;
import game.map.Location;
import game.map.World;

public class GoCommand implements Command {

	@Override
	public void onExecute(String[] args) {
		Hero hero = World.getWorld().getHero();
		Location currentLoc = hero.getHeroLocation();
		if(args.length == 0) {
			System.out.println("Usage : go [destination]");
		} else if (args.length >= 1) {
			String destinationName = args[0];
			for(int i = 1; i < args.length; i++) {
				destinationName += " " + args[i];
			}
			Exit exitName = currentLoc.getExit(destinationName);
			
			if(exitName != null) {
				if(currentLoc.getEntities() != null) {
					for(Entity entity : currentLoc.getEntities()) {
						if(entity instanceof Boss) {
							System.out.println("You have to beat the Boss to go forward.");
							return;
						}
					}
				}
				Location destination = exitName.getDestination();
				System.out.println("You move to " + destination.getName());
				hero.setHeroLocation(destination);
				System.out.println("You gain 50 HP and 10 attack damage !");
				hero.addHealth(50);
				hero.addDamage(10);
			} else {
				System.out.println("This Exit doesn't exist !");
			}
			
		}
	}

}
