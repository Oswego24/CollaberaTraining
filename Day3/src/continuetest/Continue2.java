package continuetest;

public class Continue2 {
	
	//We can use continue statement with a label.
	//This feature is introduced since JDK 1.5.
	//So, we can continue any loop in Java now whether it is 

	public static void main(String[] args) {
		aa:
			for(int i=1; i<=3; i++) {
				bb:
					for(int j=1; j<=3; j++) {
						if(i==1&&j==1) {
							//using continue statement label
							continue aa;
							//break;
						}
						System.out.println(i+" "+j);
					}
			}
	}

}
