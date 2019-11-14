package lambdas;

public class MathTest {

	public static void main(String[] args) {
		MathTest test = new MathTest();
		//with type declaration
		MathOperation add = (int a, int b) -> a + b;
		//without type declaration
		MathOperation subtract = (a, b) -> a - b;
		//with return statement along with curly braces
		MathOperation multiply = (int a, int b) -> {return a * b;};
		//without return statement and without curly braces
		MathOperation divide = (int a, int b) -> a / b;
		
		System.out.println("10 + 5 = " + test.operate(10, 5, add));
		System.out.println("10 - 5 = " + test.operate(10, 5, subtract));
		System.out.println("10(5) = " + test.operate(10, 5, multiply));
		System.out.println("10 / 5 = " + test.operate(10, 5, divide));

	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
