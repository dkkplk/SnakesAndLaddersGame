package snakesandladders.model;

import java.util.Random;

public class NormalDice implements Dice {
	int rollValue;

	public NormalDice() {
		rollValue = 0;
	}

	public int getRollValue() {
		return rollValue;
	}

	public void rollDice() {
		rollValue = (int) (Math.random() * 6) + 1;
	}
}
