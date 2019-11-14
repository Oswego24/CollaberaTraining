package regex;

import java.util.regex.*;

public class MatchOnlyAlpha {

	public static void main(String[] args) {

		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "Washitye")); //True. 7 char long. Starts with W
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "Washityeee"));//False. Over 7 char long.
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "Oashitye"));// False. Doesn't start with W
	}
}
