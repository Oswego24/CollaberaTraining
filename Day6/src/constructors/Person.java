package constructors;

public class Person {
	private String name;
	
	//zero parameter constructor
	public Person() {
		//use setName instead of this.name = name;
		//so that name is set through only one 
		//entry point (setName method)
		setName("Unknown");
	}
	
	//overloading constructor by changing parameters
	public Person(String name) {
		//use setName instead of this.name = name;
		//so that name is set through only one 
		//entry point (setName method)
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
