package myInterface;

public interface Vehicle {

	String getBrand();
	String speedUp();
	String slowDown();
	
	default String turnAlarmOn() {
		return "Turning vehicle alarm on.";
	}
	
	default String turnAlarmOff() {
		return "Turning vehicle alarm off.";
	}
	
	static int getHorsePower(int rpm, int torque) {
		return (rpm * torque) / 5252;
	}
}
