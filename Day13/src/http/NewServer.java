package http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

public class NewServer {

	public static void main(String[] args) throws IOException{
		HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
		server.createContext("/index.html", new IndexHTMLHandler());
		System.out.println("Starting server!");
		server.start();
	}

}

class IndexHTMLHandler implements HttpHandler{
	@Override
	public void handle(HttpExchange exchange)throws IOException{
		byte[] response = "Welcome to My Index Page!".getBytes();
		exchange.sendResponseHeaders(200, response.length);
		OutputStream os = exchange.getResponseBody();
		os.write(response);
		os.close();
	}
}
