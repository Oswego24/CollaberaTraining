package chat;

import java.io.IOException;
import java.net.Socket;

import server.Protocol;
import server.Server;
import server.ServerHandler;

public class ChatHandler extends ServerHandler {

	public static final String PREFIX = "\\name:";
	public static final int PREFIX_COUNT = PREFIX.length();
	
	public String myName;
	
	public ChatHandler(Server server, Socket socket, String name) throws IOException {
		super(server, socket);
		myName = name;
	}
	
	@Override
	public String processUserInput(String msg) {
		if(myParent.logging) System.out.println("processing inupt: "+msg);
		if(msg==null)
			return msg;
		if(msg.length()>PREFIX_COUNT && msg.substring(0,PREFIX_COUNT).equals(PREFIX)) {
			if(myParent.logging) System.out.println("Change Name:");
			myName = msg.substring(PREFIX_COUNT);
			return "Name changed to "+myName;
		}
		myParent.clientAlert(myName+": "+msg);
		return null;
	}

}
