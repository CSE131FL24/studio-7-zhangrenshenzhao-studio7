package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public Fraction add(Fraction other) {
		int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
		int newDenominator = this.denominator * other.denominator;
		return new Fraction(newNumerator, newDenominator);
	}
	
	public Fraction multiply(Fraction other) {
		return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
	}
	
	public Fraction reciprocal() {
		return new Fraction(denominator, numerator);
	}
	
	private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }
	
	private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
	
	public static void main(String[] args) {
		Fraction frac1 = new Fraction(1, 2);
        Fraction frac2 = new Fraction(3, 4);
        
        System.out.println("Sum: " + frac1.add(frac2).numerator + "/" + frac1.add(frac2).denominator);
        System.out.println("Product: " + frac1.multiply(frac2).numerator + "/" + frac1.multiply(frac2).denominator);
        System.out.println("Reciprocal of frac1: " + frac1.reciprocal().numerator + "/" + frac1.reciprocal().denominator);
	}

}
