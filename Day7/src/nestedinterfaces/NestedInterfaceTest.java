package nestedinterfaces;

import nestedinterfaces.Showable.Message;

interface Showable{
	void show();
	interface Message{
		void msg();
	}
}

public class NestedInterfaceTest implements Showable, Showable.Message {
	public void msg() {
		System.out.println("Hello nested interface");
	}
	
	public static void main(String[] args) {
		Showable.Message message = new NestedInterfaceTest(); //upcasting performed here
		Showable message1 = new NestedInterfaceTest();
		message.msg();
		message1.show();
	}

	@Override
	public void show() {
		System.out.println("Howdy from the show method");

	}

}
