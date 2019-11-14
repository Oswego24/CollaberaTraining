
public class UniqueDigits {

	public static void main(String[] args) {
		int amount = 0;
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4; j++) {
				
				for(int k=1; k<=4; k++) {
					if(k!=j && j!=i && i!=k){
						
						amount++;
						System.out.println(i + "" + j + "" + k);
					}
			
						
				
						
					}
				}
			}
		}

	}


