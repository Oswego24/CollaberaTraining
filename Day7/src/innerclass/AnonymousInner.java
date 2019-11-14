package innerclass;

abstract class Person{
	abstract void eat();
}
public class AnonymousInner {

	public static void main(String[] args) {
		Person person = new Person() {  //In an abstract class you can't simply create a class object
										//You must define that class object within the parenthesis
			@Override
			void eat() {
				System.out.println("Nice Fruits");
			}
		};
		person.eat();
	}
}
