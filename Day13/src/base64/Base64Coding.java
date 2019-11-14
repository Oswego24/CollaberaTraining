package base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Coding {

	public static void main(String[] args) {
		//1. Base64 Encoding a string using the base 64 encoder
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = "username:password";
		String encodedString = encoder.encodeToString(
				normalString.getBytes(StandardCharsets.UTF_8));
		System.out.println(encodedString);
		
		//2. Decoding a base 64 encoded String
		//Just get the instance of Base64.Decoder and 
		//use it to decode the base 64 encoded string.
		
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodedByteArray = decoder.decode(encodedString);
		
		//Verify the decoded string
		System.out.println(new String(decodedByteArray));

	}

}
