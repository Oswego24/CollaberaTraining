package factorial;

public class FractorialTest {

	public static void main(String[] args) {
		
		int n=5;
		//5! 
		int result = factorial(n);
		result = factorialRecursive(n);
		System.out.println(result);
		
	}

	public static int factorialRecursive(int num) { //Creating a class for factorialRecursive()
		System.out.println("factorial " + num);     
		
		if(num==0) {                                
			return 1;
		}else {
		return num * factorialRecursive(num-1);     //We don't know what factorialRecursive(num-1) is
		 											//so we repeat the method until num==0. This 
													//returns 1. then we plug 1 back into factorialRecursive
		                                            //This lets us simplify it into an int.
													//By plugging this back into the previous factorialRecursive 
		                                            //call, and doing so several times, we assign the 
													//int we are left with to result which is then printed
	}
}
	public static int factorial(int number) {  //Creating a class for factorial(n)
		int fact=1;  //declaring a variable 
		
		for(int i=1; i<=number; i++) { //we create an incrementally increasing variable i
			fact=fact*i;				//so that we can do the factorial. Then we multiple
		}								//our variable by i (the incremental variable). 
		return fact;  //fact equals 5factorial and returns us to our previous method
	}
	
}
