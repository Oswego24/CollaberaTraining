package classes;

class I{
	String s = "AAA";
	
	void methodI() {
		System.out.println(s);
	}
	
	//The static inner class can't call the outer class
	//static before our inner class was our error
	//static class B{
			 class B{
		void methodB() {
			methodI();
		}
	}
}