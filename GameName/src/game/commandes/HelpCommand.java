package game.commandes;

public class HelpCommand implements Command {
	
	@Override
	public void onExecute(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("List of commands available : " +
		"GO [location] : Take us to the desired location. \n" + 
		"QUIT : Quit the game. \n" + 
		"TAKE [item] : add the item of the current location (if it's possible) and stock it in the bag. \n" +
		"USE [item] : Use the items desired. \n" +
		"LOCATION : display a list of locations available. \n " +
		"LOOK [Location] : if no arguments is given, display a description of the location. Otherwise display a description of the item desired. \n");		
	}
}