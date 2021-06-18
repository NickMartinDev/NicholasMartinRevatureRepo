package game;

import fixtures.Room;

import java.util.Scanner;

public class Main {
	
	static boolean quit = false;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Set up rooms
		//set up player
		RoomManager rm = new RoomManager();
		Player newPlayer = new Player();
		rm.init();
		newPlayer.currentRoom = rm.startingRoom;
		
		while(!quit) {
			printRoom(newPlayer);
			System.out.println("Where do you want to go?" + "\nOr do you want to quit?");
			PrintAllExits(newPlayer);
			
			String answer = collectInput();
			
			parse(answer, newPlayer);
		}
	}
	
	private static void printRoom(Player player) {
		System.out.println(player.currentRoom);
	}
	
	private static void PrintAllExits(Player player) {
		if(player.currentRoom.getNorthExit() != null) {
			System.out.println("North exit: " + player.currentRoom.getNorthExit().getShortDesc());
		}
		if(player.currentRoom.getEastExit() != null) {
			System.out.println("East exit: " + player.currentRoom.getEastExit().getShortDesc());
		}
		if(player.currentRoom.getSouthExit() != null) {
			System.out.println("South exit: " + player.currentRoom.getSouthExit().getShortDesc());
		}
		if(player.currentRoom.getWestExit() != null) {
			System.out.println("West exit: " + player.currentRoom.getWestExit().getShortDesc());
		}
	}
	
	private static String collectInput() {
		
		String input = scan.nextLine();
		
		return input;
	}
		
	private static void parse(String command, Player player) {
		Room nextRoom = null;
		switch (command.toLowerCase()) {
		case "go north":
			nextRoom = player.currentRoom.getNorthExit();
			break;
		case "go east":
			nextRoom = player.currentRoom.getEastExit();
			break;
		case "go south":
			nextRoom = player.currentRoom.getSouthExit();
			break;
		case "go west":
			nextRoom = player.currentRoom.getWestExit();
			break;	
		case "quit":
			quit = true;
			scan.close();
			break;
		default:
			break;
		}
		if(nextRoom != null) {
			player.currentRoom = nextRoom;
		}
	}
}