package objectoutput;

import objectoutput.SchoolType;
import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
	private Date dob;
	private SchoolType schoolType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public SchoolType getSchoolType() {
		return schoolType;
		
	}
	public void setSchoolType(SchoolType schoolType) {
		this.schoolType = schoolType;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Student s = (Student) super.clone();
		SchoolType st = (SchoolType) s.getSchoolType().clone();
		s.setSchoolType(st);
		return s;
	}
	
	public String toString() {
		return "Student [Name = " + name + ", ID = " + id + ", DOB = " + dob + "School Type = " + schoolType + "]";
	}

}
