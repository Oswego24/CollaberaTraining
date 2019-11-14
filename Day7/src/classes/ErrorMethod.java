package classes;

class A4{
	void methodOne() {
		class B4{
			void methodTwo() {
				System.out.println("Method Two");
			}
		}
	}
	
	void methodThree() {
		A4 a = new A4();
	//	A4.B4 b = a.new B4();
		
	//	b.methodTwo();
	}
}
