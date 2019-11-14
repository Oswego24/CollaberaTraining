package threads;

public class ThreadNamingApp {

	public static void main(String[] args) {
		//creating two methods
		ThreadNaming t1 = new ThreadNaming("TT-RR-1");
		ThreadNaming t2 = new ThreadNaming("AA-YY-2");
		
		//Now changing the name of the threads
		t1.setName("Alpha");
		t2.setName("Beta");
		
		//getting the above created thread names.
		System.out.println("Thread 1: " + t1.getName());
		System.out.println("Thread 2: " + t2.getName());
		
		t1.start();
		t2.start();
	}

}
