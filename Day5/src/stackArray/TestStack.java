package stackArray;

public class TestStack {

	public static void main(String[] args) {
		MyStack test = new MyStack(); 
		
		test.push("Pizza");
		test.push("Beer");
		test.push("Wings");
		test.push("Steak");
		test.push("Burgers");
		test.pop();
		test.pop();
		test.peek();
		test.pop();
		test.pop();
		test.peek();

	}	
}


