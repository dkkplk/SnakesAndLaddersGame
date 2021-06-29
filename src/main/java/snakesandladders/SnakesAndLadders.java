package snakesandladders;

import snakesandladders.model.CrookedDice;
import snakesandladders.model.Dice;
import snakesandladders.model.NormalDice;
import snakesandladders.service.Game;

public class SnakesAndLadders {

	public static void main(String[] args) {

		Dice dice = new NormalDice();
		//Choose ant one dice 
	//	Dice dice = new CrookedDice();
		Game game = new Game(dice);

		for (int i = 0; i < 10; i++) {
			game.makeMove();
		}
		
		
		

	}

}
