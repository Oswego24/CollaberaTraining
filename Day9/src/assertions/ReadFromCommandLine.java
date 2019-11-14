package assertions;

import java.util.Arrays;

public class ReadFromCommandLine {

	public static void main(String[] args) {
		assert args.length >= 2;
		//assert 1 == 0;
		System.out.println(Arrays.toString(args));	
	}
}