package myInterface;

public abstract class MotorBike implements Vehicle {
	
	private final String brand;
	
	public MotorBike(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String getBrand() {
		return brand;
	}
	
	@Override
	public String speedUp() {
		return "The Motor Bike is Speeding Up.";
	}
	
	@Override
	public String slowDown() {
		return "The Motor Bike is Slowing Down.";
	}
	
	@Override
	public String toString() {
		return "You have a " + brand + ". Nice bike!";
	}

}
