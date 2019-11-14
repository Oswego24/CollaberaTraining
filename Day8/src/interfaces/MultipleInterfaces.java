package interfaces;

public class MultipleInterfaces implements I1, I2{

	public static void main(String[] args) {
		
		MultipleInterfaces object = new MultipleInterfaces();
		object.method1();
		object.method2();
	}
	
	@Override
	public void method1() {
		System.out.println("Hello from method 1");
	}
	
	@Override
	public void method2() {
		System.out.println("Hello from method 2");
	}

}
