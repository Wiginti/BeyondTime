package game.main;

import java.util.Scanner;

import game.commandes.GoCommand;
import game.commandes.HelpCommand;
import game.commandes.LookCommand;
import game.commandes.QuitCommand;
import game.commandes.TakeCommand;
import game.commandes.UseCommand;
import game.entities.Hero;
import game.map.World;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean theEnd = false;
		
		World world = World.getWorld();
		Hero hero = world.getHero();
		
		System.out.println("Bonjour jeune Aventurier !\nBienvenue dans l'aventure BeyondTime.\nTout d'abord quel est ton nom ?");
		Scanner scanner = new Scanner(System.in);
		hero.changeName(scanner.next());
		
		System.out.println("Bonjour " + hero.getName() + "\nAvant de commencer tu peux obtenir la liste des commandes disponibles pour jouer au jeu en tapant HELP");
		while(theEnd != true) {
			System.out.print("> ");
			scanner = new Scanner(System.in);
			String inputString = scanner.nextLine();
			String[] parts = inputString.split(" ");
			System.out.println(inputString);
			System.out.println(parts[0]);
			
			String[] arguments = new String[parts.length - 1];
			System.arraycopy(parts, 1, arguments, 0, arguments.length);
			
			switch(parts[0].toLowerCase()) {
			case "go":
				GoCommand goCommand = new GoCommand();
				goCommand.onExecute(arguments);
				break;
			case "help":
				HelpCommand helpCommand = new HelpCommand();
				helpCommand.onExecute(arguments);
				break;
			case "look":
				LookCommand lookCommand = new LookCommand();
				lookCommand.onExecute(arguments);
				break;
			case "quit":
				QuitCommand quitCommand = new QuitCommand();
				quitCommand.onExecute(arguments);
				break;
			case "take":
				TakeCommand takeCommand = new TakeCommand();
				takeCommand.onExecute(arguments);
				break;
			case "use":
				UseCommand useCommand = new UseCommand();
				useCommand.onExecute(arguments);
				break;
			default:
				System.out.println("La commande n'existe pas");
			}
		}
		
		
		

	}

}
