package snakesandladders.model;

import java.util.Random;

public class CrookedDice implements Dice {
	int rollValue;

	public CrookedDice() {
		rollValue = 0;
	}

	public int getRollValue() {
		return rollValue;
	}

	public void rollDice() {
		Random random = new Random();
		rollValue = Math.abs((random.nextInt() * 2) % 6);

	}
}
