
public class InchFtConversionLoop {

	public static void main(String[] args) {

		for(int i=1; i<=20; i++) {
			double feet = i/12.0;
			if(i==1) {
				System.out.println(i + " inch is equal to " + feet + " feet.");
			}else {
				System.out.println(i + " inches is equal to " + feet + " feet.");
				if(i%4==0) {
					System.out.println();
				}
			}
		}
	}

}
