package lambda;

public class LambdaMultiParams {

	public static void main(String[] args) {
		
		//Multiple parameters in the lambda expression
		Addable add = (a, b) -> (a + b);
		System.out.println("a + b = " + add.add(5, 7));
		//Multiple parameters with data type in lambda expression
		Addable add2 = (int a, int b) -> (a + b);
		System.out.println("a + b = " + add2.add(50, 70));

	}

}
