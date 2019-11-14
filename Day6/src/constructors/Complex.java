package constructors;

public class Complex {
	private double real, imag;
	
	//A normal parameterized constructor
	public Complex(double re, double im) {
		this.real = re;
		this.imag = im;
	}
	
	//copy constructor
	public Complex(Complex c){
		real = c.real;
		imag = c.imag;
	}
	
	//Overriding the equals of Object class
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Complex complex = (Complex) obj;
		return (this.real == complex.real && this.imag == complex.imag);
	}
	
	public String toString() {
		return "(" + real + " + " + imag + "i)";
	}
}
