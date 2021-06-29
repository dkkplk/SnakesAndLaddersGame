package snakesandladders.service;

import snakesandladders.model.Dice;
import snakesandladders.model.NormalDice;

public class Game {
	public Board board;
	public Player p;
	public Dice dice;

	public Game(Dice dice) {
		board = new Board();
		p = new Player("Player 1");
		this.dice = dice;
	}

	public void makeMove() {
		dice.rollDice();
		int diceValue = dice.getRollValue();
		System.out.println("Dice Roll Value is " + diceValue);
		if (diceValue == 6) {
			p.firstChanceOver();
		} else {
			p.movePlayer(diceValue);
			System.out.println("Player Position is " + p.getPlayerPos());
			snakeCheck();
		}

	}

	public boolean isGameOver() {
		if (p.getPlayerPos() == 99)
			return true;
		else
			return false;
	}

	public void snakeCheck() {
		if (board.isSnakePresent(p.getPlayerPos())) {
			p.setPlayerPos(board.getSnakeTail(p.getPlayerPos()));
			System.out.println("Snake Byte happend and player position is " + p.getPlayerPos());
		}
	}

}
