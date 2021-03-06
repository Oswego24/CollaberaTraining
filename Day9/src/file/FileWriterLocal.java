package file;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterLocal {

	public static void main(String[] args) throws IOException {

		File folder = new File("MyFolder");
		File test = new File(folder, "test.txt");
		try {
			new FileOutputStream(test).write("This is a test file".getBytes());
		}catch(IOException x) {}
		if(!folder.exists()) {
			folder.mkdir();
		}else {
			
			File file = new File(folder, "data.txt");
			//file
			
			FileOutputStream fos = new FileOutputStream(file);
			
			fos.write("This is a file written by Java".getBytes());
			
			fos.close();
			
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Parent: " + file.getParent());
			System.out.println("Absolute Path: " + test.getAbsolutePath());
			System.out.println("Parent: " + file.getParent());
			
		}

	}

}
