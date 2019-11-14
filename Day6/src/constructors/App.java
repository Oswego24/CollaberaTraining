package constructors;

public class App {

	public static void main(String[] args) {
		Complex c1 = new Complex(10, 15);
		
		//copy-constructor call
		Complex c2 = new Complex(c1);
		
		//Note that following doesn't involve a copy constructor call as
		//non-primitive variables are just references
		Complex c3 = c2;
		
		if(c1.equals(c2)) {
			System.out.println("c1 equals c2");
		} else {
			System.out.println("c1 NOT equals c2");
		}

		if(c3 == c2) {
			System.out.println("c1 == c2");
		} else {
			System.out.println("c1 != c2");
		}
		
		System.out.println(c2);
	}

}
