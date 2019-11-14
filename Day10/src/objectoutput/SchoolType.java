package objectoutput;

public class SchoolType implements Cloneable {
	
	private String type;
	private String duration;
	
	public SchoolType(){
		
	}
	
	public SchoolType(SchoolType schoolType) {
		this.type = schoolType.getType();
		this.duration = schoolType.getDuration();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "School [Type = " + type + ", Duration = " + duration + "]";
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
