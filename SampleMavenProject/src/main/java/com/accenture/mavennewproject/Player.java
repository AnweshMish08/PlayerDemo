package com.accenture.mavennewproject;

public class Player {
	String playerName;
	int playerNumber;
	boolean onTeam;
	
	public Player(String playerName, int playerNumber, boolean presentOnTeam) {
		super();
		this.playerName = playerName;
		this.playerNumber = playerNumber;
		this.onTeam = presentOnTeam;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public boolean isOnTeam() {
		return onTeam;
	}

	public void setOnTeam(boolean onTeam) {
		this.onTeam = onTeam;
	}
	public String toString() {
        return "Player{" +
                "Player Name = '" + playerName + '\'' +
                ", Player Number = '" + playerNumber + '\'' +
                '}';
    }
}