package cloning;

public class Test2 implements Cloneable {
	int a, b;
	
	Test c = new Test();
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Test2 v = new Test2();
		v = (Test2)super.clone();
		v.c = new Test();
		v.c.x = c.x;
		v.c.y = c.y;
		return v;
	
	}
		
}

