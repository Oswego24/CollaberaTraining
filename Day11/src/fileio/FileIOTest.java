package fileio;
import java.io.*;
import java.util.HashSet;

/**
 * Program that reads lines from an input text file(inputfile.txt),
 * then writes them to an output file (outputfile.txt), excluding duplicate lines.
 * Make use of:
 *  - BufferedReader - to read lines from input file
 *  - HashSet add() method to store lines without duplicates
 *  - PrintWriter - to write lines of text to the output file
 *  		
 */

public class FileIOTest {

	public static void main(String[] args) throws IOException{

		File inFile = new File("inputfile");
		//File outFile = new File("outputfile");
		FileOutputStream fos = new FileOutputStream("outputfile");
		PrintWriter pw = new PrintWriter(fos);
		//FileInputStream fis = new FileInputStream(inFile);
		HashSet<String> h_set = new HashSet<String>();
		//h_set.add("55");
		
		try {
			FileReader fr = new FileReader(inFile);
			BufferedReader bReader = new BufferedReader(fr);
			String str;
	
			str = bReader.readLine();
			while(str!=null) {
				h_set.add(str);
				str = bReader.readLine();
			}
			bReader.close();
			System.out.println(h_set);
			//for(String s : h_set) {
			//	pw.print(s);
			//}
			pw.println(h_set);
			pw.flush();
			pw.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}catch(IOException x){
			System.out.println("IOException: " + x.getMessage());
		}
	}

}
