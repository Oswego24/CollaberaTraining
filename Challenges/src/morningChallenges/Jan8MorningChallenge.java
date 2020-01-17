package morningChallenges;

public class Jan8MorningChallenge {

	public static void main(String[] args) {
		//Explain the difference between: JDK, JVM, JRE
		
		//Java Development Kit: Contains several resources for developing a java application, including a JVM and JRE
		//	Compilers source code to bytecode
		//Java Virtual Machine: A virtual machine that allows you to compile and run java applications on your computer
		//	Interprets the bytecode 
		//Java Runtime Environment: Free Oracle software that includes a JVM and the Java Standard Library
		//	
		
		//Factorial Problem
		
		System.out.println(findFactorial(12));
		
	}
	private static int findFactorial(int i) {
		//This is also an example of recursion (a method that calls itself continually)
		//Notice how we call findFactorial in the return statement of the findFactorial method
		//This is the ternary operator in  use:
		return i <= 1 ? 1 : i * findFactorial(i-1);
	}

}
