package studio7;

import java.util.Random;

public class Die {
	private int sides;
	private Random random;
	
	public Die(int sides) {
		this.sides = sides;
		this.random = new Random();
	}
	
	public int roll() {
        return random.nextInt(sides) + 1;
    }
	
	public static void main(String[] args) {
		Die die1 = new Die(6);
        System.out.println("Rolling the die: " + die1.roll());
	}

}
