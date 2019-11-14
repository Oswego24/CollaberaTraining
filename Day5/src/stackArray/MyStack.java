package stackArray;

public class MyStack {

	private int stackSize = 3; //indicates the size of stack(array)
	private String[] stackData = new String[stackSize]; //initializing the string
	private int topOfStack = -1;// Setting to -1 so the first time we call topOfStack
								//it increments to 0.
	public MyStack() {}// creates the MyStack class to call from
	//add new data to the stack(array)
	public void push(String data) {//creating our push method
		if(topOfStack < stackSize - 1) {
			topOfStack++; //top of stack increments to 0
			stackData[topOfStack] = data; //the top element in our array is set
			System.out.println("PUSH: new data element [" + stackData[topOfStack] + "] is pushed into the stack");
		}else {
			System.out.println("PUSH: Cannot push. The stack is full");
		}
	}
	//remove top element from the stack(array)
	public String pop() {
		/*if(topOfstack < stackSize - 1){   //if topOfStack is smaller than the stack size,
		 topOfstack++;						//then it can increment up. 
		 stackData[topOfStack] = data;		//top of stack = data = the string you pushed
		*/
		if(stackData[0] != "") { //less elegant if 
			System.out.println("POP: top data element [" + stackData[topOfStack] + "] is removed from the stack");
			stackData[topOfStack] = "";
			topOfStack--;
			return stackData[topOfStack]; 
		}else {
			System.out.println("POP: Cannot pop. The stack is empty");
			return stackData[topOfStack];
		}
	}
	//look at the top element of the stack(array)
	public String peek() {
		if(stackData[0] != "") {
			System.out.println("PEEK: [" + stackData[topOfStack] + "] is at the top of the stack");
			stackData[topOfStack] = "";
			return stackData[topOfStack];
		}else {
			System.out.println("PEEK: Cannot peek. The stack is empty");
			return stackData[topOfStack];
		}
	}
}
