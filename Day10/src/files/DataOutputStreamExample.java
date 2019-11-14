package files;

import java.io.*;

public class DataOutputStreamExample {

	public static void main(String[] args) {
		
		File file = new File("data.dat");
		
		try(FileOutputStream fos = new FileOutputStream(file);
				DataOutputStream dos = new DataOutputStream(fos);){
			
			//You could also declare fos and dos within the try block
			//FileOutputStream fos = new FileOutputStream(file);
			//DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(12345);
			dos.writeBoolean(true);
			dos.writeChar('W');	
			//dos.close(); //Used if you declared inside the try block
		}catch(FileNotFoundException x){
			System.out.println("File Not Found: " + x.getMessage());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}