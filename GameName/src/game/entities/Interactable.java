package game.entities;

public interface Interactable {
	
	public default void discuss(String message) {
		System.out.println(message);
	}

}
