package questions;

/*Inner classes allow us to reference multiple classes without having to create
//multiple files for our program
//create the class outside of your main class and main method
//Our main method can call upon any Inner class by calling up to Outer class then using dot
//notation to call upon the classes within 
 */

class X{
	int x = 111;
	
	static class Y extends X{
		int y = x + 222;
	}
	
	class Z extends X.Y{
		int z = y + 333;
	}
}

public class whatsPrinted {

	public static void main(String[] args) {
		
		X.Z z = new X().new Z();
		
		System.out.println(z.x);
		System.out.println(z.y);
		System.out.println(z.z);
	}

}
