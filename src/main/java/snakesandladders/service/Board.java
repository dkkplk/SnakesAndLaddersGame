package snakesandladders.service;

import snakesandladders.model.Snake;
import snakesandladders.model.Tile;

public class Board {
	Tile[] tiles;
	Snake[] snakes;

	public Board() {
		tiles = new Tile[100];

		for (int i = 0; i < 100; i++) {
			tiles[i] = new Tile(i);
		}

		setSnakes();
	}

	void setSnakes() {
		snakes = new Snake[1];

		snakes[0] = new Snake(tiles[14], tiles[7]);

	}

	public boolean isSnakePresent(int tileID) {

		if (snakes[0].getHead().getTileIndex() == tileID)
			return true;

		return false;
	}

	public boolean isSnakeTailPresent(int tileID) {

		if (snakes[0].getTail().getTileIndex() == tileID)
			return true;

		return false;
	}

	public int getSnakeTail(int tileID) {

		if (snakes[0].getHead().getTileIndex() == tileID)
			return snakes[0].getTail().getTileIndex();

		return -1;
	}

}
