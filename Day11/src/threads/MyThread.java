package threads;

public class MyThread extends Thread {

	public MyThread() {
		for(int i=1; i<=10; i++) {
			System.out.println("Print Document #" + i + " Printer 1");
		}
	}

	public MyThread(Runnable r) {
		System.out.println("===========");
	}

	//@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Print Document #" + i + " Printer 2");
		}
	}
}

