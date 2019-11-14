package syncthreads;

public class SyncThreadApp {

	public static void main(String[] args) {
		System.out.println("Application Started");
		
		Printer p = new Printer();
		
		MyThread myRef = new MyThread(p);
		SyncThread syncRef = new SyncThread(p);
		
		myRef.start();
		syncRef.start();
		System.out.println("Application Finished");
	}

}
