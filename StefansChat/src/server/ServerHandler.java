package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**\
 * 
 * @author Stefan
 *
 *	Things I need to do with the handler (whichever class that is):
 *	- Alter user state as a result of user input
 *	- Alter user state due to server input
 *	- Alter server state as a result of user input
 *	- Alter server state due to server input
 *	- output to client due to user input
 *	- output to client due to server input
 *
 */

public abstract class ServerHandler extends Thread {
	
	protected Server myParent;
	private Socket mySocket;
	private PrintWriter out;
	private BufferedReader in;
	
	private Lock readLock = new ReentrantLock();
	private Lock writeLock = new ReentrantLock();
	
	
	public ServerHandler(Server server, Socket socket)throws IOException {
		myParent = server;
		mySocket=socket;
		
		out = new PrintWriter(socket.getOutputStream());
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}
	
	//listen to user input. when we get something process it with the protocol.
	//protocol decides whether the correct response involve
	public void run() {
		try {
            out = new PrintWriter(mySocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
        
            String inputLine=null;
            String outputLine=null;

            
            do {
            	if(myParent.logging) System.out.println(" waiting... ");
            	outputLine = processUserInput(inputLine);
            	if(outputLine==null)
            		continue;
            	writeln(outputLine);
            }while ((inputLine = in.readLine())!=null);
            
            
            out.close();
            in.close();
            if(myParent.logging) System.out.println("Socket closed");
            mySocket.close();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void writeln(String msg) {
		writeLock.lock();
		out.println(msg);
		writeLock.unlock();
	}
	
	public abstract String processUserInput(String msg);
/*
	private Socket socket;
	private Protocol protocol;
	
	private PrintWriter out;
	private BufferedReader in;
	
	private boolean handlerRunning;
	
	public Protocol getProtocol() {
		return protocol;
	}

	public ServerHandler(Socket socket, Protocol protocol) {
		this.socket = socket;
		this.protocol=protocol;
	}
	
	
	public synchronized String processInput(String input) {
		return protocol.processInput(input);
	}
	
	public synchronized void write(String output) {
		if(handlerRunning)
			return;
		out.println(output);
	}//*/
}
