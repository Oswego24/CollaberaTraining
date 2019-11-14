package constructors;

public class Rectangle {
	private int width, height;
	
	// no parameter: values of both width and height are assigned to zero
	public Rectangle() {
		width = 0;
		height = 0;
	}
	
	//one parameter: values of both width and height are both assigned to parameter
	public Rectangle(int w) {
		setWidth(w);
		setHeight(w);
	}
	
	//two parameters: values of width and height are assigned to parameters respectively
	public Rectangle(int w, int h) {
		setWidth(w);
		setHeight(h);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int area() {
		int area = getWidth() * getHeight();
		return area;
	}
	
}
