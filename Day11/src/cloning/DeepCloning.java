package cloning;

public class DeepCloning {

	public static void main(String[] args) {
		
		Foo f1 = new Foo();
		f1.num = 5;
		f1.nums = new int[] {2,4,6,7,8};
		Foo f2 = (Foo)f1.clone();
		System.out.print(f2.num + ": ");
		for(int n : f2.nums) {
			System.out.print(n);
		}

	}

}
