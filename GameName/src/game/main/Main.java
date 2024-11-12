package game.main;

import java.util.List;
import java.util.Scanner;

import game.entities.Hero;

public class Main {
	
	private List<String> messages;
	/*private enum commandes {
		HELP, LOOK;
		}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		World world = World.getWorld();
		Hero hero = world.getHero();
		
		Location l1 = new Location("")
		
		System.out.println("Bonjour jeune Aventurier !\nBienvenue dans l'aventure BeyondTime.\nTout d'abord quel est ton nom ?");
		Scanner scanner = new Scanner(System.in);
		hero.changeName(scanner.next());
		System.out.println("Bonjour " + hero.getName() + "\nAvant de commencer tu peux obtenir la liste des commandes disponibles pour jouer au jeu en tapant HELP");
		
		
		World theWorld = World.getWorld();
		
		

	}

}
