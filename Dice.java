
// --------------------------------------------------------------------
// Assignment 4
// Written by: Hamza Shaikh ID:40129291
// For COMP 248 Section ECUX -Fall 2019
// --------------------------------------------------------------------
// 11/27/2019
import java.util.Random;

public class Dice {

	private int die1; // integer value of first dice
	private int die2; // integer value of second dice

	// Default constructor
	public Dice() {
		die1 = die2 = 0;
	}

	// Constructor method
	public Dice(int die1, int die2) {
		this.die1 = die1;
		this.die2 = die2;
	}

	// Accessor Methods
	public int getDie1() {
		return die1;
	}

	public int getDie2() {
		return die2;
	}

	// RollDice() with simulates the rolling of 2 dices
	public int rollDice() {
		Random random = new Random();
		die1 = random.nextInt(5) + 1; // add 1 from the random number generated restricted from 0 to 5, so that the
										// numbers generate from 1 to 6
		die2 = random.nextInt(5) + 1;
		return die1 + die2;
	}

	// we assign the attribute die2 to die1 determine if the resulting boolean is
	// true or false
	public boolean isDouble() {
		return die1 == die2;
	}

	// toString() which will be called upon when printing out an object of type dice
	public String toString() {
		return "Die1: " + die1 + " Die2: " + die2;
	}
}
