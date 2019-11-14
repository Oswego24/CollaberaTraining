package files;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class TestPrintWriter {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("data.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintWriter pw = new PrintWriter(fos);
		
		ArrayList<String> name = new ArrayList<>();
		for(int i=0; i<10; i++) 
			name.add("Name " + i);
		//Prints the data to the file
		pw.println(name);
		//Prints the data on the console
		System.out.println("Names: " + name);
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for(int i=0; i<10; i++) 
			hm.put(i, " name " + i);
		pw.println(hm);
		System.out.println("Hash Map of Names: " + hm);
		pw.close();
	}
}