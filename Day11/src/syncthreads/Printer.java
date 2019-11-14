package syncthreads;

public class Printer {
	void printDocuments(int nOfCopies, String docName) {
		for(int i=0; i<=10; i++) {
			System.out.println("* Printing * " + docName + " " + i);
		}
	}
}
