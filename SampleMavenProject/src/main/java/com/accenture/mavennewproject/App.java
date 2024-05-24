package com.accenture.mavennewproject;

import java.util.*;

public class App 
{
	private static Set<Player> players = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main( String[] args )
    {
    	while (true) {
            System.out.println("1. Add Player");
            System.out.println("2. Remove Player");
            System.out.println("3. Display Players");
            System.out.println("4. Display Player on Team");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPlayer();
                    break;
                case 2:
                    removePlayer();
                    break;
                case 3:
                    displayPlayers();
                    break;
                case 4: displayPlayerOnTeam();
                	break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void addPlayer() {
        System.out.print("Enter Player Name : ");
        String playerName = scanner.nextLine();
        
        System.out.println("Enter Player Jersey Number : ");
        int jerseyNumber = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter Player Present on Team or not (true/false) : ");
        boolean onTeam = Boolean.parseBoolean(scanner.nextLine());

        players.add(new Player(playerName, jerseyNumber, onTeam));
        System.out.println("Project added successfully.");
    }

    private static void removePlayer() {
        System.out.print("Enter the Name of the player to remove: ");
        String playerName = scanner.nextLine();

        players.removeIf(player -> player.getPlayerName().equals(playerName));
        System.out.println("Player removed successfully.");
    }
    
    private static void displayPlayers() {
    	if (players.isEmpty()) {
            System.out.println("No players to display.");
        } else {
            System.out.println("Player List :");
            for (Player play : players) {
                System.out.println(play);
            }
        }
    }
    private static void displayPlayerOnTeam() {
    	System.out.println("Enter the Name of the Player : ");
    	String playerName = scanner.nextLine();
    	
    	System.out.println(players.contains(playerName));
    }
}
