package game.commandes;

public class QuitCommand implements Command {

	@Override
	public void onExecute(String[] args) {
		// TODO Auto-generated method stub
		
		System.exit(0);
		return;
		
	}

}
