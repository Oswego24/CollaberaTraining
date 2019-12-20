package AssessmentReview;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Declare our functional interface
interface FuncInterface {
	void talk();
}

interface Sum{
	int sum(int mult1, int mult2, int length);
}
public class Review {

	public static void main(String[] args) throws IOException{
		//Lambdas -> Functional Interface -> 1 Abstract Method *Since Java 8 - Default and Static methods have been added
		//Interface vs Function Interface
			//Interface: All access modifiers are public 
			//Interface: attributes are final
			//Interface: Good for multiple inheritance: implement multiple interfaces/extend one parent class
		//Interface vs Abstract Class
			//Abstract class can be partially used
			//Interface is all or nothing 
		//Declarative vs Imperative
			//Imperative: Have a goal. Explicitly state how to solve.
			//Declarative: Stream API. Have a goal. Let the stream figure it out
		//Java turns list into byte stream. This is called serialization. deserialization = byte to data
		//Marshaling: Object is serialized. Serialization is part of Marshaling. 
		//Serialization: When serialized, only member data within that object is written into the byte stream
		//  not the code that actually implements the object 
		//Array: A block of continuous memory that is indexed
			//Declared with a fixed length
			//An array in java can have both primitive types and objects
			//Wrapper classes (Integer, Character) were created for this
		//List: Has a head
			//Address and Content
			//In java these are happening behind the scenes when we import ArrayList or whatever List we're going to use
		//LinkedList vs ArrayList
			//LinkedList: better performance when manipulating the list (inserting/deleting)
			//When you insert into an array you basically make a copy of the whole array and add the new data
			//More memory intensive. Slower
			//ArrayList: is faster when accessing a specific index
		//Array vs ArrayList
			//Array: a simple fixed sized. Can contain both primitive and objects
			//ArrayList: a dynamic sized array. Can contain only object elements. Uses size() method to calc size of the array
		//Generics
			//ArrayList<GENERIC> f = ....
			//The Object that is being specified
			//Special characters can be placeholders (<T> etc..)
		
		//Show execution of Lambdas on Functional Interface
									//Our method signature. If we had parameters theyd be in parenthesis
									// ()
		FuncInterface interfaceObject = () -> System.out.println("I'm talking");
		interfaceObject = () -> System.out.println("I'm yelling");
		interfaceObject.talk();
		//The second lambda will Override the first one making changing your interface much faster and easier

		//Functional Interface declaring method with Parameters and using Stream
		Sum problem = (int mult1, int mult2, int length) -> {
			return IntStream.range(0, length)
					.filter(num -> num%mult1 == 0 || num%mult2 == 0)
					.sum();
		};
		
		System.out.println(problem);
		
		List<Employee> employees = new ArrayList<Employee>();
		String allDepartments = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment)).keySet()
				.stream()
				.reduce((e1, e2) -> (e1 + "] | [" + e2)).get();
		
		System.out.println(allDepartments);
	}


}
