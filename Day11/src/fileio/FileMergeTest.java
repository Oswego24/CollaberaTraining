package fileio;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Program that reads lines from 2 text files,
 * and writes them in a 3rd text file alternating 
 * one line from file 1 and one line from file2
 * Continue writing all the lines from the longer file
 * 
 * This program makes use of: 
 * -BufferedReader to read lines of text
 * -PrintWriter to write lines of text to a file
 * @author Oscar
 *
 */

public class FileMergeTest {
	
//	
//	public static <T> Set<T> mergeSet(Set<T> a, Set<T> b){
//		//Creating an empty set Object
//		Set<T> mergedSet = new TreeSet<T>();
//		//Add the two sets to be merged into the new set
//		mergedSet.add(a);
//		mergedSet.add(b);
//		return mergedSet;
//	}
	public static void main(String[] args) throws IOException{
	
		File a = new File("file1");
		File b = new File("file2");
		
		PrintWriter pw = new PrintWriter("output1");
		
		FileReader fr = new FileReader(a);
		FileReader fr1 = new FileReader(b);
		
		BufferedReader bReader = new BufferedReader(fr);
		BufferedReader bReader1 = new BufferedReader(fr1);
		
		String str;
		String str1;

		//Set<String> t_set1 = new TreeSet<String>();
		//Set<String> t_set2 = new TreeSet<String>();
		//Don't actually have to merge the print writer and the while loop 
		//do it for us
	
		str = bReader.readLine();
		str1 = bReader1.readLine();
		
		while(str!=null || str1!=null) {
			if(str != null) {
				pw.println(str);
				str = bReader.readLine();
			}
			if(str1 != null) {
				pw.println(str1);
				str1 = bReader1.readLine();
			}
		}
		bReader.close();
		bReader1.close();
		pw.flush();
		pw.close();
		
	}
}
