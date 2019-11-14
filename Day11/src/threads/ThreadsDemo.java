package threads;

public class ThreadsDemo {

	public static void main(String[] args) {
		Runnable r = new MyThread();
		System.out.println("\nOther Device");
		MyThread task1 = new MyThread(r);
		task1.start();
		//MyThread task2 = new MyThread();
		//task2.run();
	}
}
