package regex;

import java.util.regex.*;

public class charRegex {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[o][a-zA-Z]{4}", "oscar")); //True. Starts with o. any character between a and z. 0,1,2,3,4, characters long
		System.out.println(Pattern.matches("[o][a-zA-Z]{4}", "oscarh"));//False. Too many characters
		System.out.println(Pattern.matches("[o][a-zA-Z]{4}", "Oscar"));//False O != o
		System.out.println(Pattern.matches("[o][a-zA-Z]{5}", "oscarh"));//True. Our character length was changed to 5 so the extra h is ok
		System.out.println(Pattern.matches("[o][a-zA-z]{4}", "oscar"));
	}

}
