package game.commandes;

import game.entities.Hero;
import game.entities.Item;
import game.map.Location;
import game.map.World;

public class TakeCommand implements Command {

	@Override
	public void onExecute(String[] args) {
		// TODO Auto-generated method stub
		Hero hero =  World.getWorld().getHero();
		Location currentLoc = hero.getHeroLocation();
		Item currentItem = currentLoc.getItemByName(args[1]);
		if(currentLoc.isItemInLocation(currentItem)) {
			hero.getBag().addItem(currentItem);
			currentLoc.removeItem(currentItem);
		}
		
	}

}
