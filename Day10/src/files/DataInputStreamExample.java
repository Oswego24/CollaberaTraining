package files;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {

	public static void main(String[] args) throws IOException {

		File file = new File("data.dat");
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		int data = dis.readInt();
		boolean dataBool = dis.readBoolean();
		char dataChar = dis.readChar();
		
		System.out.println("Data Read: " + data + ", " + dataBool + ", " + dataChar);
		//System.out.println("Data Read: " + dataBool);
		//System.out.println("Data Read: " + dataChar);
		
		dis.close();
		fis.close();
	}
}