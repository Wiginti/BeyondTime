package game.commandes;

import game.entities.Hero;
import game.entities.Safe;
import game.map.Location;
import game.map.World;

public class LookCommand {
	public void onExecute(String[] args) {
		Hero hero = World.getWorld().getHero();
		Location currentLoc = hero.getHeroLocation();
		
		if(args.length == 0) {
			currentLoc.displayItems();
			System.out.println("------------------------");
			currentLoc.displayEntities();
		}
		
		if(args.length == 1) {
			switch(args[0].toLowerCase()) {
			case "item":
			case "items":
				currentLoc.displayItems();
				break;
			case "safe":
				Safe mySafe = (Safe) currentLoc.getItemByName("Safe");
				mySafe.displayItems();
			case "character":
			case "characters":
				currentLoc.displayEntities();
				break;
			case "bag":
				hero.getBag().displayItems();		
			default:
				System.out.println("Usage : look [characters, items, bag]");
			}
			
			//Item currentItem = currentLoc.getItemByName(args[1]);
			//if(currentLoc.isItemInLocation(currentItem)) {
			//}
		}
	}

}
