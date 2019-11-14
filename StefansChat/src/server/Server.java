package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Server extends Thread{

	private int portNumber;
	protected List<ServerHandler> handlers = Collections.synchronizedList(new ArrayList<>());
	
	private final Lock lock = new ReentrantLock();
	
	public boolean logging = false;
	
	public Server(int portNumber) {
        super();
        this.portNumber = portNumber;
    }
    public Server(String name, int portNumber) {
        super(name);
        this.portNumber = portNumber;
    }

    public int getPortNumber() {
		return portNumber;
	}

    public abstract ServerHandler clientConnected(Socket socket);
    public abstract void clientDisconnected();
    public abstract void clientAlert(String msg);
    
    protected void broadcast(String msg) {
    	
    	//spin a new thread for each cast so we don't 
    	if(this.logging) System.out.println("about to broadcast..");
    	//lock.lock();
    	for(ServerHandler sh : handlers) {
    		Thread thread = new Thread(() -> {
    			if(this.logging) System.out.println("writing to client");
    			sh.writeln(msg);
    		});
    		thread.start();
    	}
    	//lock.unlock();
    }
    
	
	@Override
	public void run() {
		try (ServerSocket serversocker = new ServerSocket(this.portNumber);){
			while(true) {
				
				//lock.lock();
				
				ServerHandler sh = clientConnected(serversocker.accept());
				if(sh!=null) {
					handlers.add(sh);
				}
				
				//lock.unlock();
				
				if(logging) System.out.println("server unlocked");
				sh.start();

			}
		} catch (IOException e) {
			//e.printStackTrace(System.err);
			System.err.println("Server: "+e.toString());
		}
	}
	
}
