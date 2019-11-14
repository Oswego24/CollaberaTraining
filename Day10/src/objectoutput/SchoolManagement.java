package objectoutput;

import java.io.*;
import java.util.*;
import objectoutput.SchoolType;
import objectoutput.Student;

public class SchoolManagement {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeData();
		readData();
		
	}

	private static void readData() throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("studentdata.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		HashMap<Integer, Student> dataReadFromFile = (HashMap<Integer, Student>) object;
		for(Integer id : dataReadFromFile.keySet()) {
			System.out.println(dataReadFromFile.get(id));
		}
		
	}

	private static void writeData() throws IOException {
		
		HashMap<Integer, Student> shm = new HashMap<Integer, Student>();
		for(int i=0; i<10; i++) {
			Student s = new Student();
			s.setId(i);
			s.setName("Name: " + i);
			s.setDob(new Date());
			shm.put(i, s);
		}
		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(shm);
		oos.flush();
		oos.close();
	}
}
