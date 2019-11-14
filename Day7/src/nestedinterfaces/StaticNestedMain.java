package nestedinterfaces;

public class StaticNestedMain {

	public static void main(String[] args) {
		//Access class Inner and method msg()
		StaticNested.Inner.msg();
		//Creating object for class
		StaticNested p = new StaticNested();
		//Printing out int = 5 == i 
		System.out.println("Integer: " + p.i);
	}
}
