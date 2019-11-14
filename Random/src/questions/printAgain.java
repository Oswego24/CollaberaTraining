package questions;

//Have fun with confusion

//What is printed?
class ABC{
	class XYZ{
		String s = "Inner - XYZ";
	}
}

class FFF extends ABC {
	String s = "Outer - XYZ";
	
	class ABC extends FFF{
		
	}
}
public class printAgain {

	public static void main(String[] args) {
	
	FFF object = new FFF();
	FFF.ABC object2 = new FFF().new ABC();
	
	//System.out.println(new FFF().s);
	System.out.println(new FFF().new ABC().s);
	System.out.println(new ABC().new XYZ().s);
	

	}

}
