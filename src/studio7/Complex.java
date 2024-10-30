package studio7;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }
	
	public static void main(String[] args) {
		Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        
        System.out.println("Sum: " + c1.add(c2).real + "+" + c1.add(c2).imaginary + "j");
        System.out.println("Product: " + c1.multiply(c2).real + "+" + c1.multiply(c2).imaginary + "j");
	}

}
