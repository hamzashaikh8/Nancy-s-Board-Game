// --------------------------------------------------------------------
// Assignment 4
// Written by: Hamza Shaikh ID:40129291
// For COMP 248 Section ECUX -Fall 2019
// --------------------------------------------------------------------
// 11/27/2019
public class Board {

	private int board[][][];
	private static final int MIN_LEVEL = 3;
	private static final int MIN_SIZE = 3;
	private int Level;
	private int size;

	// default constructor
	public Board() {
		this.Level = 3;
		this.size = 4;
		createBoard(Level, size);
		// also needs to call the createBoard(Level,size);
	}

	// 2 integer parameter constructor method
	public Board(int L, int x) {
		Level = L;
		size = x;
		createBoard(Level, size);

	}

	private void createBoard(int level, int size) {
		board = new int[level][][];
		for (int i = 0; i < level; i++) {
			board[i] = new int[size][];
			for (int x = 0; x < size; x++) {
				board[i][x] = new int[size];
				for (int j = 0; j < size; j++) {
					// fill the board based on the sum of i,x and j. where i is (0, level-1), x is
					// (0,size-1), j is (0,size-1)
					if ((i + j + x) == 0)
						board[i][x][j] = 0;
					else if ((i + j + x) % 3 == 0)
						board[i][x][j] = -3;
					else if ((i + j + x) % 5 == 0)
						board[i][x][j] = -2;
					else if ((i + j + x) % 7 == 0)
						board[i][x][j] = 2;
					else
						board[i][x][j] = 0;
				}

			}
		}
	}

	// Accessor methods
	public int getLevel() {
		return Level;
	}

	public int getSize() {
		return size;
	}

	public int getEnergyAdj(int l, int x, int y) {
		if (l >= 0 && l < Level && x >= 0 && x < size && y >= 0 && y < size)
			return board[l][x][y];
		else
			return -1;
	}

	// toString() method which will be called upon when printing out an object of
	// type board in the driver
	public String toString() {
		String string = "";
		for (int l = 0; l < Level; l++) {
			string += "Level " + (l) + "\n--------" + "\n";
			for (int x = 0; x < size; x++) {
				for (int j = 0; j < size; j++) {
					string += "     " + String.format("%2d", board[l][x][j]) + " ";
				}
				string += "\n";
			}
			string += "\n";
		}
		return string;
	}

}