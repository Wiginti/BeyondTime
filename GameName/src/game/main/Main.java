package game.main;

import java.util.Scanner;

import game.commandes.GoCommand;
import game.commandes.HelpCommand;
import game.commandes.LookCommand;
import game.commandes.QuitCommand;
import game.commandes.TakeCommand;
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
			String inputString = scanner.next();
			if(inputString.toLowerCase().contains("GO")) {
				GoCommand goCommand = new GoCommand();
				goCommand.onExecute(args);
			} else if (inputString.toLowerCase().contains("help")) {
				HelpCommand helpCommand = new HelpCommand();
				helpCommand.onExecute(args);
			} else if (inputString.toLowerCase().contains("LOOK")) {
				LookCommand lookCommand = new LookCommand();
				lookCommand.onExecute(args);
			} else if (inputString.toLowerCase().contains("QUIT")) {
				QuitCommand quitCommand = new QuitCommand();
				quitCommand.onExecute(args);
			} else if (inputString.toLowerCase().contains("QUIT")) {
				TakeCommand takeCommand = new TakeCommand();
				takeCommand.onExecute(args);
			} else if (inputString.toLowerCase().contains("QUIT")) {
				QuitCommand quitCommand = new QuitCommand();
				quitCommand.onExecute(args);
			} else {
				System.out.println("La commande n'existe pas");
			}
		}
		
		
		

	}

}
