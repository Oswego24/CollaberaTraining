package prime;

public class primeNumber {

	public static void main(String[] args) {

		int i, m=0,flag=0;
		int n=47; //it is the number to be checked 
		m=n/2;//variable that holds if n is even
		if(n==0||n==1) {    //seeing if our number is 1 or 0
			System.out.println(n+" is not a prime number");
		}else {
			for(i=2; i<=m; i++) { //for i which holds an even number 
				if(n%i==0) {  //if n/i has no remainder, it is not prime.
					System.out.println(n+" is not a prime number");
					flag = 1; //changing flag from 0 to 1
					break;						
					}
				}
				//We initialized flag as = 0. If flag is = 0 at this point 
				//it means that variable flag was never changed.
				if(flag==0) {
					System.out.println(n+" is a prime number");
				//end of else
			}
			
		}

	}

}
