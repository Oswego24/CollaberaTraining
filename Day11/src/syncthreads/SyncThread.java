package syncthreads;

public class SyncThread extends Thread {
	Printer pRef;
	
	SyncThread(Printer p){
		pRef = p;
	}
	
	@Override
	public void run() {
		synchronized(pRef) {
			pRef.printDocuments(10, "JohnsResume.pdf");
		}
	}
}
