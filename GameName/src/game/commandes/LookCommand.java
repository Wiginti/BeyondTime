package game.commandes;

import game.map.Location;
import game.map.World;

public class LookCommand {
	public void onExecute(String[] args) {
		Location currentLoc = World.getWorld().getHero().getHeroLocation();
		
		if(args.length == 0) {
			currentLoc.displayItems();
			System.out.println("------------------------");
			currentLoc.displayCharacters();
		}
		
		if(args.length == 1) {
			switch(args[0].toLowerCase()) {
			case "item":
			case "items":
				currentLoc.displayItems();
				break;
			case "character":
			case "characters":
				currentLoc.displayCharacters();
				break;
			default:
				System.out.println("Usage : look [characters, items]");
			}
			
			//Item currentItem = currentLoc.getItemByName(args[1]);
			//if(currentLoc.isItemInLocation(currentItem)) {
			//}
		}
	}

}
