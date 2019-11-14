package constructors;

/**
 * Returns the sum of this Fraction
 * and the parameter frac. The sum
 * returned is NOT simplified.
 * 
 * @author User
 */

public class Fraction {
	private int numerator, denominator;
	
	/**
	 * Zero parameter constructor
	 * 
	 * */
	public Fraction() {
		//creates 0/1
		this(0,1);
	}
	
	/** Constructor with one int parameter
	 *
	 * @param number the numerator*/
	public Fraction(int number) {
		//creates number/1
		this(number, 1);
	}
	
	/** Contsructor with one Fraction parameter
	 * 
	 * @param frac the fraction containing numerator and denominator
	 * */
	public Fraction(Fraction frac) {
		//copy constructor
		this(frac.getNumerator(), frac.getDenominator());
	}
	
	/** Constructor with two int parameters
	 * *
	 * @param num the numerator
	 * @param denom the denominator
	 */
	public Fraction(int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
	}
	
	/** Getter for numerator
	 * 
	 * @return numerator the numerator
	 */
	public int getNumerator() {
		return numerator;
	}
	
	/** Setter for numerator
	 * 
	 * @param numerator the numerator
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	/** Getter for denominator
	 * 
	 * @return denominator the denominator
	 */
	public int getDenominator() {
		return denominator;
	}
	
	/** Setter for denominator
	 * 
	 * @param denominator the denominator
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	/** Computes numerator divided by denominator (not simplified)
	 * 
	 * @return numerator/denominator numerator divided by denominator
	 */
	public int compute() {
		return numerator/denominator;
	}
}
