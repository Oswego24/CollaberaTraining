package composition;

public class Memory {

	private String brand;
	private String size;
	
	public Memory(String brand, String size) {
		this.brand = brand;
		this.size = size;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		return "Memory{" + " Brand = " + brand + ", size = " + size + "}";
	}
}
