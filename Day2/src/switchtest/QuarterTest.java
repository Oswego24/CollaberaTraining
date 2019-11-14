package switchtest;

public class QuarterTest {

	public static void main(String[] args) {
		
	int quarter=1;
		
		String quarterString="";
		
		switch(quarter) {
			case 1: 
			case 2: 
			case 3: quarterString="Quarter 1";
				break;
			case 4: 
			case 5: 
			case 6: quarterString="Quarter 2";
				break;
			case 7: 
			case 8: 
			case 9: quarterString="Quarter 3";
				break;
			case 10:
			case 11:
			case 12: quarterString="Quarter 4";
				break;
			default:System.out.println("Input error: Invalid Data");
			}
			System.out.println(quarterString);

	}

}
