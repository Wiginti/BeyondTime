package game.commandes;

public class HelpCommand implements Command {
	
	@Override
	public void onExecute() {
		// TODO Auto-generated method stub
		System.out.println("Liste des commandes disponibles : " +
		"GO Location \n" + 
				"MOVE Location");		
	}

}
