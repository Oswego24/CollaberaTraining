package annotations;

import annotations.MyAnnotation;

public class TestAnnotation {

	//@MyAnnotation
	private String reverse(String data) {
		return new StringBuilder(data).reverse().toString();
	}
}
