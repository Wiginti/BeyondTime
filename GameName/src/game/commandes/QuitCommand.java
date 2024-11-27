package game.commandes;

public class QuitCommand implements Command {

	@Override
	public void onExecute(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("You left the game.");
		
		System.exit(0);
		return;
		
	}

}
