package myAbstract;

public abstract class MyAbstractProcess {

	public void process() {
		stepBefore();
		action();
		stepAfter();
	}

	private void stepBefore() {
		
		System.out.println("Pizza");
		
	}

	private void action() {
	
		System.out.println("Wings");
		
	}

	private void stepAfter() {
		
		System.out.println("Beer");
		
		
	}
}
