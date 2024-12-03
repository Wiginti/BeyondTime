package game.entities;

public interface Fightable {
	
	public default void attack(Entity entity, int amount) {
		entity.removeHealth(amount);
	}

}
