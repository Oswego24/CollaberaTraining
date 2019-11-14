package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		// Set up file and stream
		File inFile = new File("data2.txt");
		//File inFile = new File("data.txt");
		try {
			FileReader fileReader = new FileReader(inFile);
			//BufferedReader only reads Strings
			BufferedReader bReader = new BufferedReader(fileReader);
			String str;
		
			str = bReader.readLine();
			while(str!=null) {
				System.out.println(str);
				str = bReader.readLine();
			}
			bReader.close();
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found: " + e.getMessage());
		}catch(IOException x){
			System.out.println("IOException: " + x.getMessage());
		}
	}
}
