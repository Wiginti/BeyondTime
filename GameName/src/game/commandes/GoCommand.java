package game.commandes;

public class GoCommand implements Command {

	@Override
	public void onExecute(String[] args) {
		System.out.println("GoCommand file");
	}

}
