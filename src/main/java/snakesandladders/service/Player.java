package snakesandladders.service;

public class Player {
	String name;
	int playerPos;
	boolean firstChance;

	public Player(String name) {
		this.name = name;
		this.playerPos = 0;
		this.firstChance = true;
	}

	
	public void movePlayer(int diceValue) {
		if (playerPos + diceValue < 100)
			playerPos += diceValue;
	}

	public int getPlayerPos() {
		return playerPos;
	}

	public String getName() {
		return name;
	}

	public void setPlayerPos(int playerPos) {
		this.playerPos = playerPos;
	}

	public boolean isFirstChance() {
		return firstChance;
	}

	public void firstChanceOver() {
		firstChance = false;
	}
}
