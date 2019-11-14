package innerouter;

//class OuterClass{
	//class InnerClass{
	//	int i;
//	}
//}
//new OuterClass().new InnerClass().i

abstract class OuterClass{
	int x = 5;
	abstract void method1();
	static abstract class InnerClass{
		static int i = 4;
		abstract void method2();
	}
}
public class Outer{

	public static void main(String[] args) {
		
		new OuterClass() {
			void method1() {
				System.out.println(x);
			}
		}.method1();
		
		new OuterClass.InnerClass() {
			void method2() {
				System.out.println(i);
			}
		}.method2();
	}

}
