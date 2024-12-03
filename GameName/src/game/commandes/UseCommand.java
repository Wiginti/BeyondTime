package game.commandes;

import game.entities.Bag;
import game.entities.Hero;
import game.entities.Potion;
import game.map.World;

public class UseCommand implements Command {

	@Override
	public void onExecute(String[] args) {
		Hero hero =  World.getWorld().getHero();
		Bag bag = hero.getBag();
		if(args.length >= 1) {
				if(args[0].equalsIgnoreCase("Potion")) {
					try{
						Potion potion = (Potion) bag.getItemByName("Potion"); // Cast because getItemByName return an Item
						potion.use(hero);
						System.out.println("You use a potion.");
						System.out.println("Your new health amount is :" + hero.getHealth());
						bag.removeItem(potion);
					} catch (Exception e){
						System.out.println("You don't have any Potion in your bag !");
					}
					
				} else {
					System.out.println("This item doesn't exist !");
				}
		}
		
		
		
	}

}
