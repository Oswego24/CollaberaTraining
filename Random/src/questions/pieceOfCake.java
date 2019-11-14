package questions;

//What is printed

class A{
	int i = 1;
	
	class B{
		int i = 2;
		
		//If you remove extends you'll get a different result
		class C extends A{
			void methodC() {
				System.out.println(i);
			}
		}
	}
}

public class pieceOfCake {

	public static void main(String[] args) {
		A.B.C object = new A().new B().new C();
		new A().new B().new C().methodC();
	}

}
