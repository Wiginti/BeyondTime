package game.main;

import java.util.Scanner;

import game.commandes.AttackCommand;
import game.commandes.GoCommand;
import game.commandes.HelpCommand;
import game.commandes.LookCommand;
import game.commandes.QuitCommand;
import game.commandes.TakeCommand;
import game.commandes.UseCommand;
import game.entities.Boss;
import game.entities.Hero;
import game.entities.Potion;
import game.entities.Safe;
import game.map.Exit;
import game.map.Location;
import game.map.World;

public class Main {
	
	public static void main(String[] args) {
		
		//attribute to see when the game is finished
		boolean theEnd = false;
		
		World world = World.getWorld();
		Hero hero = world.getHero();
		Location prehistory = world.getLocation(0);
		Location antiquity = world.getLocation(1);
		Location middle_ages = world.getLocation(2);
		Location renaissance = world.getLocation(3);
		Location contemporary_era = world.getLocation(4);
		hero.setHeroLocation(prehistory);
		
		//Init Safe
		Safe safe1 = new Safe();
		safe1.addItem(new Potion());
		
		//Init Exits
		prehistory.addExit("shimmering portal", new Exit("shimmering portal", antiquity));
        antiquity.addExit("glowing archway", new Exit("glowing archway", middle_ages));
        middle_ages.addExit("mysterious door", new Exit("mysterious door", renaissance));
        renaissance.addExit("futuristic portal", new Exit("futuristic portal", contemporary_era));
        
        //Init Boss
        prehistory.addEntity(new Boss(40, 10, "Mammoth King Graath"));
        antiquity.addEntity(new Boss(70, 15, "Pharaoh Ankh’set"));
        middle_ages.addEntity(new Boss(120, 25, "Necromancer Malvorath"));
        renaissance.addEntity(new Boss(200, 40, "Pirate King Blacktide"));
        contemporary_era.addEntity(new Boss(330, 70, "Cyber-Tyrant Nexus"));
		
		//Init Locations
		prehistory.addItem(safe1);
		prehistory.addItem(safe1.getKey());
		
		
		System.out.println("Hello young Adventurer!\nWelcome to the BeyondTime adventure.\nFirst, what is your name?");
		Scanner scanner = new Scanner(System.in);
		hero.changeName(scanner.next());
		hero.getBag().addItem(new Potion());
		
		System.out.println("Hello " + hero.getName() + "\nIn this game, you will have to fight against Boss to continue into the next Level !\nBefore we begin, you can get the list of available commands to play the game by typing HELP.");
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
