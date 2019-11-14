package annotations;

public class AnnotationProcessor {

	public static void main(String[] args) throws ClassNotFoundException{
		TestAnnotation testAnnotation = new TestAnnotation();
		System.out.println(testAnnotation.getClass());
		System.out.println(testAnnotation.getClass().getPackageName());
		System.out.println(TestAnnotation.class.getPackageName());
		
		System.out.println(TestAnnotation.class.getClassLoader().getName());

	}

}
