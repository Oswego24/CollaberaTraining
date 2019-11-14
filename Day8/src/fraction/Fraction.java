package fraction;

/**
 * Return the sum of this Fraction 
 * and the parameter frac. The sum
 * returned is NOT simplified 
 * 
 * @author Oscar
 */

public class Fraction {
	private int numerator, denominator;
	
	/**
	 * Zero parameter constructor
	 */
	public Fraction() {
		//creates zero and one
		this(0,1);
	}

	/**Constructor with one int parameter
	 * 
	 * @param number the numerator
	 */
	public Fraction(int number) {
		this(number, 1);
	}
	
	/**Constructor for two int parameters
	 * 
	 * @param num the numerator
	 * @param denom the denominator
	 */
	public Fraction(int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
	}
	
	/**Getter for the Numerator
	 * 
	 * @return numerator
	 */
	
	public int getNumerator() {
		return numerator;
	}
	/**Setter for Numerator
	 * 
	 * @param numerator the numerator 
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	/**Getter for Denominator
	 * 
	 * @return denominator the denominator
	 */
	public int getDenominator() {
		return denominator;
	}
	
	/**Setter for Denominator
	 * 
	 * @param denominator the denominator
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	/**Computes the fraction
	 * 
	 * @return the result of division
	 */
	public int compute() {
		return numerator/denominator;
	}
}


