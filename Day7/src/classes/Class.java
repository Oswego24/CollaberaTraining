package classes;

class A8{
	static String s = "AAA";
	
	class B{
		String s = "BBB";
		
		void methodB() {
			System.out.println(s);
		}
	}
}
public class Class {

	public static void main(String[] args) {
		
		A a = new A();
		
	//	System.out.println(a.s);
		
	//	A8.B b = a.new B();
		
//		System.out.println(b.s);
		
	//	b.methodB();
	}

}
