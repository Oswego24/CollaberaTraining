package cloning;

public class Foo implements Cloneable {
	public int num = 0;
	public int[] nums;
	
	@Override
	public Foo clone() {
		Foo object = null;
		try {
			object = (Foo)super.clone();  //copies fields
			object.nums = nums.clone(); //arrays implement clone
		}catch(CloneNotSupportedException e) {}
		return object;
	}
}
