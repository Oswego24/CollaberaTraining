
public class Blackjack {

	public static void main(String[] args) {
		System.out.println("Your hand is: " + blackjack());
		if(blackjack()>21) {
			System.out.println("Bust");
		}
	}
	public static int blackjack() {
		int x = (int) Math.random()*((11-1)+1)+1;
		int y = (int) Math.random()*((11-1)+1)+1;
		int z = (int) Math.random()*((11-1)+1)+1;
		int sum = x + y + z;
		
		if(sum<=21) {
			return sum;
		}else if(sum>21&&x==11) {
			sum -= 10;
			return sum;
		}else if(sum>21&&y==11){
			sum -= 10;
			return sum;
		}else if(sum>21&&z==11) {
			sum -= 10;
			return sum;
		}else {
			return sum;
		}
	}
}
