package enums;

public class enumFruit {
	
	public static void main(String[] args) {
		
		AnotherClass.Fruit Fruit = AnotherClass.Fruit.APPLE;
		AnotherClass.Fruit f1, f2;
		f1 = AnotherClass.Fruit.APPLE;
		f2 = f1;
		System.out.println("You really love " + f2);
		
		
		AnotherClass.Fruit favoriteFruit= AnotherClass.Fruit.APPLE;
		
		switch(favoriteFruit) {
		case APPLE: System.out.println("Your favorite fruit is apple");
			break;
		case ORANGE: System.out.println("Your favorite fruit is orange");
			break;
		case BANANA: System.out.println("Your favorite fruit is banana");
			break;
		default:System.out.println("Error");
		}
		
	}

}
