package game.commandes;
import game.entities.Hero;

import game.entities.Item;
import game.map.Location;
import game.map.World;

public class LookCommand {
	public void onExecute(String[] args) {
		Location currentLoc = World.getWorld().getHero().getHeroLocation();
		if(args.length == 1) {
			if(currentLoc.isItemInLocation(args[0]) == true) {
				
			}
		}
	}

}
