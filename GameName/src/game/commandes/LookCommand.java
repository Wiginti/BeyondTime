package game.commandes;

import game.entities.Chest;
import game.entities.Hero;
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
				Chest myChest = (Chest) currentLoc.getItemByName("Safe");
				myChest.displayItems();
			case "character":
			case "characters":
				currentLoc.displayEntities();
				break;
			case "bag":
				hero.getBag().displayItems();
				break;
			case "destination":
			case "destinations":
				currentLoc.displayExits();
				break;
			case "health":
				System.out.println("You have " + hero.getHealth() + " HP");
				break;
			default:
				System.out.println("Usage : look [entities, items, bag, destination, health]");
			}
		}
	}

}
