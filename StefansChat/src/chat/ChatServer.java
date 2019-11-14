package chat;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JFrame;

import server.Server;
import server.ServerHandler;

public class ChatServer extends Server {

	private Lock lock = new ReentrantLock();
	private static int numclients = 0;
	
	public ChatServer(String string, int port) {
		super(string, port);
	}

	
	@Override
	public ServerHandler clientConnected(Socket socket) {
		try {
			
			String s = "User"+(numclients++);
			return new ChatHandler(this,socket,s);
			
		} catch (IOException e) {
			System.err.print("Server: ");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void clientDisconnected() {
		//idgaf
	}

	@Override
	public void clientAlert(String msg) {
		if(logging) System.out.println("broadcasting...");
		this.broadcast(msg);
	}
	
	
	//Test Drivers
	
	public static void main(String[] args) {
		int port = 9876;
		ChatServer server = new ChatServer("ChatServer",port);
		server.logging = true;
		server.start();
		
		Object timer = new Object();
		for(int i=0;i<3;i++) {
			
			//ChatClient.startClientGUI("127.0.0.1",port,JFrame.DISPOSE_ON_CLOSE);
		}
	}
}
