package myInterface;

public class Interface implements Printable, Showable{
	
	@Override
	public void print() {
		System.out.println("print() implementation");
	}
	
	@Override
	public void show() {
		System.out.println("show() implementation");
	}
	
	public static void main(String[] args) {
		//Interface object = new Interface();
		Printable object = new Interface();
		Showable object1 = new Interface();

		object.print();
		object1.show();
			
	}

}
