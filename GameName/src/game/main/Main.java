package game.main;

import java.util.Scanner;

import game.commandes.AttackCommand;
import game.commandes.GoCommand;
import game.commandes.HelpCommand;
import game.commandes.LookCommand;
import game.commandes.QuitCommand;
import game.commandes.TakeCommand;
import game.commandes.UseCommand;
import game.entities.Hero;
import game.entities.Potion;
import game.entities.Safe;
import game.map.Location;
import game.map.World;

public class Main {
	
	public static void main(String[] args) {
		
		//attribute to see when the game is finished
		boolean theEnd = false;
		
		World world = World.getWorld();
		Hero hero = world.getHero();
		Location l1 = world.getLocation(0);
		Location l2 = world.getLocation(1);
		Location l3 = world.getLocation(2);
		Location l4 = world.getLocation(3);
		Location l5 = world.getLocation(4);
		hero.setHeroLocation(l1);
		
		//Init Safe
		Safe safe1 = new Safe();
		safe1.addItem(new Potion());
		
		//Init Locations
		l1.addItem(safe1);
		l1.addItem(safe1.getKey());
		
		
		System.out.println("Bonjour jeune Aventurier !\nBienvenue dans l'aventure BeyondTime.\nTout d'abord quel est ton nom ?");
		Scanner scanner = new Scanner(System.in);
		hero.changeName(scanner.next());
		hero.getBag().addItem(new Potion());
		
		System.out.println("Hello " + hero.getName() + "\nAvant de commencer tu peux obtenir la liste des commandes disponibles pour jouer au jeu en tapant HELP");
		while(theEnd != true) {
			System.out.print("> ");
			
			//Get the inputs from the player
			scanner = new Scanner(System.in);
			String inputString = scanner.nextLine();
			
			//Player can't enter an empty input
			if(inputString.matches(".*[a-zA-Z].*")) 
			{
				String[] parts = inputString.split(" ");
				
				//Get the arguments in an String array
				String[] arguments = new String[parts.length - 1];
				System.arraycopy(parts, 1, arguments, 0, arguments.length);
				
				//Manage the different commands
				
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
				case "attack":
					AttackCommand attackCommand = new AttackCommand();
					attackCommand.onExecute(arguments);
					break;
				default:
					System.out.println("Command doesn't exit ! Type HELP to see the list of the commands availables.");
				}
			} else {
				System.out.println("Please enter a command.");
			}
		}
			
		
		
		

	}

}
