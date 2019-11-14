package nestedinterfaces;

public class StaticNested {
	static int data = 50;
	
	public int i = 5;
	
	static class Inner{
		static void msg() {
			System.out.println("Data: " + data);
		}
		
		//You can put your main method in a whole other class and it runs the same
		//Check StaticNestedMain.java
		public static void main(String[] args) {
			StaticNested.Inner.msg();
		}
	}
}
