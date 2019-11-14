package server;

import java.net.Socket;

public interface ServerProtocol {
	public void userConnected(Socket socket);
	public void userDisconnected();
	public void protocolMessaged(String msg);
}
