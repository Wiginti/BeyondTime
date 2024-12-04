package game.commandes;

import game.entities.Chest;
import game.entities.Hero;
import game.entities.Item;
import game.map.Location;
import game.map.World;

public class TakeCommand implements Command {

	@Override
	public void onExecute(String[] args) {

		Hero hero =  World.getWorld().getHero();
		Location currentLoc = hero.getHeroLocation();
		Item currentItem = currentLoc.getItemByName(args[0]);
		if(currentItem != null) {
			if(currentLoc.isItemInLocation(currentItem)) {
				if(currentItem instanceof Chest) {
					if(args.length == 2) {
						try {
							Item itemInSafe = ((Chest) currentItem).getItemByName(args[1]);
							((Chest) currentItem).removeItem(itemInSafe);
							hero.getBag().removeItem(itemInSafe);
						} catch (Exception e){
							System.out.println("This item is not in the Safe");
						}
					} else {
						System.out.println("Usage : take Safe [item]");
					}
				} else {
					hero.getBag().addItem(currentItem);
					currentLoc.removeItem(currentItem);
					System.out.println("You pick a " + currentItem.toString());	
				}
			
			}	
		} else {
			System.out.println("This item doesn't exist !");
		}
	}
}
