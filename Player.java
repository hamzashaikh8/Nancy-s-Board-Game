// --------------------------------------------------------------------
// Assignment 4
// Written by: Hamza Shaikh ID:40129291
// For COMP 248 Section ECUX -Fall 2019
// --------------------------------------------------------------------
// 11/27/2019
public class Player {
	// Player attributes
	private String name;
	private int Level;
	private int x;
	private int y;
	private int energy;

	// default constructor
	public Player() {
		name = "";
		energy = 10;
		Level = 0;
		x = 0;
		y = 0;
	}

	// constructor method with 1 parameter
	public Player(String username) {
		name = username;
		energy = 10;
		Level = 0;
		x = 0;
		y = 0;
	}

	// contructor method with 3 parameters
	public Player(int newLevel, int newX, int newY) {
		Level = newLevel;
		x = newX;
		y = newY;
		name = "";
		energy = 10;
	}

	// custom copy constructor which will assign all attributes of the player in the
	// parameter to the other player
	public Player(Player pToCopy) {
		this.name = pToCopy.getName();
		this.energy = pToCopy.getEnergy();
		this.Level = pToCopy.getLevel();
		this.x = pToCopy.getX();
		this.y = pToCopy.getY();
	}

	// Mutator methods for all player attributes
	public void setName(String newName) {
		name = newName;
	}

	public void setEnergy(int newEnergy) {
		energy = newEnergy;
	}

	public void setLevel(int newLevel) {
		Level = newLevel;
	}

	public void setX(int newX) {
		x = newX;
	}

	public void setY(int newY) {
		y = newY;
	}

	// Accessor Methods for all player attributes

	public String getName() {
		return name;
	}

	public int getEnergy() {
		return energy;
	}

	// this method will return the Level of that the player is currently located in
	public int getLevel() {
		return Level;
	}

	// this method will return the x-coordinate that the player is currently located
	// in
	public int getX() {
		return x;
	}

	// this method will return the y-coordinate of that the player is currently
	// located in
	public int getY() {
		return y;
	}

	// this method will swap the locations of the passing and the passed object
	public void moveTo(Player p) {
		Player temp = new Player();
		// place attributes of p inside those of temp
		temp.setLevel(p.getLevel());
		;
		temp.setX(p.getX());
		temp.setY(p.getY());
		// place attributes of the calling object in the passing object
		p.setLevel(Level);
		p.setX(x);
		p.setY(y);
		// place the attributes of the passing object to the calling object via object
		// temp
		Level = temp.getLevel();
		x = temp.getX();
		y = temp.getY();
		// Congratulations! We have successfully switched the level,x and y of two
		// objects
	}

	// determine if the two players are at the same location
	public boolean equals(Player p) {
		return Level == p.getLevel() && x == p.getX() && y == p.getY();
	}

	public boolean won(Board b) {
		return (Level == (b.getLevel() - 1) && x == (b.getSize() - 1) && y == (b.getSize() - 1));
	}

	// toString() method that will print out whenever printing an object of type
	// Player
	public String toString() {
		return name + " is on level " + Level + " at location (" + x + "," + y + ") and has " + energy
				+ " units of energy";
	}

	// custom changeTo method to change the attributes of one object of type Player
	// to that of the parameter
	public void changeTo(Player p1) {
		this.name = p1.getName();
		this.energy = p1.getEnergy();
		this.Level = p1.getLevel();
		this.x = p1.getX();
		this.y = p1.getY();
	}

	// custom swapIndex0n1() to change the reference of players of index 0 and 1
	public static void swapTwoPlayers(Player p0, Player p1) {
		Player temp = new Player(p0);
		p0.changeTo(p1);
		p1.changeTo(temp);
	}
}
