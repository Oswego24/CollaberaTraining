package threads;

public class Runnable1 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread anonymous");
				for(int i=0; i<=1000; i++) {
					System.out.println("- Printing Document #" + i + " - Printer A");
				}
			}
		}).start();
		
		new Thread(
			() -> {
				System.out.println("Thread with lambda");
				for(int i=0; i<=1000; i++) {
					System.out.println(" + Printing Document #" + i + "- Printer B");
				}
			}).start();
	}
}