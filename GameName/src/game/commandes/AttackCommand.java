package game.commandes;

import game.entities.Boss;
import game.entities.Entity;
import game.entities.Hero;
import game.map.Location;
import game.map.World;

public class AttackCommand implements Command {

	@Override
	public void onExecute(String[] args) {
		Hero hero = World.getWorld().getHero();
		Location currentLoc = hero.getHeroLocation();
		
		String entityName = args[0];
		for(int i = 1; i < args.length; i++) {
			entityName += " " + args[i];
		}
		Entity currentEntity = currentLoc.getEntityByName(entityName);
		if(args.length == 0) {
			System.out.println("Usage : attack [Entity]");
		} else if(args.length >= 1) {
			if(currentEntity != null) {
				int amountDamageHero = hero.getDamage();
				hero.attack(currentEntity);
				System.out.println(currentEntity.getName() + " lose " + amountDamageHero + " HP");
				if(currentEntity instanceof Boss) {
					Boss currentBoss = (Boss) currentEntity;
					int amountDamageBoss = currentBoss.getDamage();
					currentBoss.attack(hero);
					System.out.println("You lose " + amountDamageBoss + " HP");
					if(currentBoss.getHealth() <= 0) {
						currentLoc.removeEntity(currentEntity);
						System.out.println(currentEntity.getName() + " is dead !");
					}
				}
		} else {
			System.out.println("This entity doesn't exit !");
		}
	}
}
}
