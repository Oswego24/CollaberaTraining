package lambda;

interface Drawable2{
	void draw();
}

public class AfterLambda {

	public static void main(String[] args) {
		int width = 10;
		
		
		Drawable2 d2 = ()->{
			System.out.println("Drawing " + width);
		};
		d2.draw();
	}
}