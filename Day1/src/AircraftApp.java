
public class AircraftApp {

	public static void main(String[] args) {
		Aircraft cessna = new Aircraft(4, 400, 50, 9.5);
		Aircraft saratoga = new Aircraft(8, 500, 55, 9.5);

	}

}

class Aircraft {
	int passengers;
	int cruiseSpeed;
	double fuelCapacity;
	double fuelBurnRate;
	
	Aircraft(int p, int c, double fc, double fbr){
		passengers = p;
		cruiseSpeed = c;
		fuelCapacity = fc;
		fuelBurnRate = fbr;
	}
}