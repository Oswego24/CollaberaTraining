package inheritance;

public class TestPets {

	public static void main(String[] args) {
		Pet myDog = new Dog();
		System.out.println(myDog.speak()); //from superclass Pet
		//System.out.println(myDog.fetch()); //can't fetch because no fetch method in Pet
		
		Pet myCat = new Cat();
		System.out.println(myCat.speak()); // from Cat class
		//System.out.println(myCat.fetch()); //not defined in Cat

	}

}
