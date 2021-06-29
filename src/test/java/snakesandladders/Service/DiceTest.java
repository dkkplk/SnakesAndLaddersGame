package snakesandladders.Service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import snakesandladders.model.CrookedDice;
import snakesandladders.model.Dice;
import snakesandladders.model.NormalDice;
import snakesandladders.service.Game;

public class DiceTest {

	@Test
	public void testNormalDice() {
		Dice dice = new NormalDice();
		assertTrue(dice.getRollValue() < 6);
	}

	@Test
	public void testCrookedDice() {

		Dice dice = new CrookedDice();
		int rollValue = dice.getRollValue();
		assertTrue(rollValue % 2 == 0);
		;

	}

}
