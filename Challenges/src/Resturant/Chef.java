package Resturant;

public class Chef implements Runnable {

	private Orders orders;

	public Chef(Orders orders) {
		this.orders = orders;
	}

	@Override
	public void run() {

		String name = Thread.currentThread().getName();
		
		try {
					
			String order;
			synchronized (orders) {
				System.out.println(name + " is waiting for an order");
				orders.wait();
				Thread.sleep(1000);
				order = orders.nextOrder();
				
			}
				
				if(order==null) {
					System.out.println("No orders to take, " + name + " can rest");
				}else {
					System.out.println(name + " has recieved an order for " + order);
					Thread.sleep(1000);
					System.out.println(name + " is preparing " + order);
					Thread.sleep(1000);
					System.out.println(name + " has completed the order for " + order);
					
					
				}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}
