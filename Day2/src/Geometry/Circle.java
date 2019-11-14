package Geometry;

public class Circle {

		
		private double radius;
		
		public Circle() {
			
			radius = 1;
			
		}
		public void setRadius(double rad) {
			radius = rad;
		}
		public double getArea() {
			return Math.PI * radius * radius;
			
		}
		public double getCircumference() {
			return 2 * Math.PI * radius;
			
		}
}
