import java.util.ArrayList;
import java.util.List;

public class intArray {

	public static void main(String[] args) {
		
		List<Integer> array = new ArrayList<Integer>();
		
		for(int i=1; i<=100; i++) {
			array.add(i);
		}
		array.remove(98);

	}

}
