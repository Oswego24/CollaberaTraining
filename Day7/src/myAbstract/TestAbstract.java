package myAbstract;

public abstract class TestAbstract {
	
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		s = new Rectangle();
		s.draw();
		s.normalMethod();
	}
}