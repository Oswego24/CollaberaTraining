package innerclass;

interface Eatable{  //create the interface above the start of our class
	void eat();
}

public class AnonymousClassWithInterface {

	public static void main(String[] args) {
		Eatable veg = new Eatable() {
			public void eat() {
				System.out.println("Eat up!");
			}
		};
		veg.eat();
	}

}
