package classes;

class A{
	void methodA1(int i) {
		System.out.println(i+++i);
	}
	
	void methodA2(int i) {
		System.out.println(--i-i--);
	}
}

class B{
	A a = new A() {
		void methodA1(int i) {
			System.out.println(++i+i++);
		}
		
		void methodA2(int i) {
			System.out.println(i---i);
		}
	};
}

public class MainClass2 {

	public static void main(String[] args) {
		A a = new A();
		a.methodA1(10);
		a.methodA2(10);
		B b = new B();
		b.a.methodA1(10);
		b.a.methodA2(10);

	}

}
