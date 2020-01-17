package coreJava;

public class Incrementing {

	public static void main(String[] args) {
		int increment = 10;
		
		if(increment==10) {
			System.out.println("COUNTDOWN BEGINS");
			for(int i=10; i>0; i--) {
				System.out.println(i);
			}
			System.out.println("BLASTOFF!!!");
			increment--;
		}
		if(increment==9) {
			System.out.println("You're at 9, and looking fine!");
			increment--;
		}
		if(increment==8) {
			System.out.println("You're at 8 and looking great, but use a switch statement for goodness sake!!");
			increment--;
		}
		System.out.println("Whew! Made it");
	}

}
