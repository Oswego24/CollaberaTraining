package recursive;

public class ListNames {

	public static void main(String[] args) {
		
		listNames("Oscar", "Holloway");

	}

	private static void listNames(String name, String name2) {
		
		if(name != name2){
			System.out.println(name + " " + name2);
		}
	}
}