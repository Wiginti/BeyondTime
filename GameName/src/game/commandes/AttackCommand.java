package game.commandes;

import game.entities.Boss;
import game.entities.Entity;
import game.entities.Hero;
import game.entities.Item;
import game.map.Location;
import game.map.World;

public class AttackCommand implements Command {

	@Override
	public void onExecute(String[] args) {
		Hero hero = World.getWorld().getHero();
		Location currentLoc = hero.getHeroLocation();
		Entity currentEntity = currentLoc.getEntityByName(args[0]);
		if(args.length == 0) {
			System.out.println("Usage : attack [Entity]");
		} else if(args.length == 1) {
			if(currentEntity != null) {
				int amountDamageHero = hero.getDamage();
				hero.attack(currentEntity, amountDamageHero);
				if(currentEntity instanceof Boss) {
					Boss currentBoss = (Boss) currentEntity;
					int amountDamageBoss = currentBoss.getDamage();
					currentBoss.attack(hero, amountDamageBoss);
				}
		}
	}
}
}
