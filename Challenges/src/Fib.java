import java.util.ArrayList;
import java.util.List;

public class Fib {

	public static void main(String[] args) {
//		int sum = 0;
//		List<Integer> fibby = new ArrayList<Integer>();
//		
//		fibby.add(0);
//		fibby.add(1);
//		
//		while(fibby.get(fibby.size()-1)<= 4000000) {
//			int next = fibby.get(fibby.size()-1) + fibby.get(fibby.size()-2);
//			fibby.add(next);
//			
//			if(next%2==0) {
//				sum += next;
//			}
//		}
		int x = 0;
		int y = 1;
		int z = 0; 
		int sum = 0;
		
		while(y<=4000000) {
			if(y%2==0) 
				sum += y;
			z = y; 
			y = x + y;
			x = z;
		}
		System.out.println(sum);
	}
}
