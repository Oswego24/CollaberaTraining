package loops;

public class ForLoop {

	public static void main(String[] args) {
		
		pyramid1();
		System.out.println("");
		pyramid2();
	}		
		
		public static void pyramid1() {
			int i = 0;
			for(i=0; i<7; i++) {
				for(int j=0; j<i+1; j++) {
				System.out.print("* ");
				}
			System.out.println();			
			}
	}

		public static void pyramid2() {
			int i = 0;
			for(i=7; i>0; i--) {
				for(int j=0; j<i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
	}
}


