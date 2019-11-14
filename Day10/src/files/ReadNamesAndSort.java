package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadNamesAndSort {

	public static void main(String[] args) {
		
		Scanner scan;
		try {
			//Using the scanner to scan the file
			scan = new Scanner(new File("data.txt"));
			
			while(scan.hasNextLine()) {
				String name = scan.nextLine();
				System.out.println("Name: " + name);
			}
		}catch(IOException e) {
			e.printStackTrace();		
		}

	}

}
