package innerouter;

abstract class X{
	static String s1 = "STATIC";
	String s2 = "NON-STATIC";
	abstract void methodX();
	
	static abstract class Y{
		String s1 = "NON-STATIC";
		static String s2 = "STATIC";
		abstract void methodY();
		
		static abstract class Z{
			String s1 = "Threes the key!";
			String s2 = "For me!";
			abstract void methodZ();
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		new X() {
			void methodX() {
				System.out.println(s1 + " : " + s2);
			}
		}.methodX();
		
		new X.Y() {
			void methodY() {
				System.out.println(s1 + " : " + s2);
			}
		}.methodY();
		
		new X.Y.Z() {
			void methodZ() {
				System.out.println(s1 + " " + s2);
			}
		}.methodZ();
	}

}
