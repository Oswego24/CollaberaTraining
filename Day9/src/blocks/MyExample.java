package blocks;

import java.util.*;

public class MyExample {
	int age;
	
	//			Non-Static Block:
	// - A non-static block executes when the object is created, before the constructor
	// - There is no keyword prefix to make a block non-static block, unlike static blocks.
	// - In case of multiple non-static blocks , the blocks executes the order in which it is defined in the block
	// - All static and non-static fields can be accessed freely.
	// - All non-static block executes every time an object of the containing class is created
	// - A typical non-static block looks like below
	{
		age = 7;
		System.out.println("Hello In Non Static Block() age = " + age);
	}
	
	{
		System.out.println("Hello In Non Static Block(1)");
	}
	
	public MyExample() {
		System.out.println("Contstructor Blocks called");
	}
	
	//			Static Blocks:
	// - A static block is a block of code which contains code that executes at class loading time
	// - A static keyword is prefixed before the start of the block.
	// - All static variables can be accessed freely
	// - Any non-static fields can only be accessed through object reference, thus only after object construction
	// - Multiple static blocks would execute in the order they are defined in the class
	// - All static blocks execute only once per classloader
	static {
		String os = System.getProperty("os.name");
		System.out.println(os);
	}
	
	static {
		
		Map<String, String> systemproperties = System.getenv();
		Set<String> keys = systemproperties.keySet();
		for(String key : keys) {
			System.out.println(key + " => " + systemproperties.get(key));
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			//If you don't instantiate the object below, our constructor is never called
			MyExample blocks = new MyExample();
		}
	}
}