import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class WebServerExample {
    public static void main(String[] args) throws IOException {
        var port = Integer.parseInt(args[0]);
        var server = HttpServer.create(new InetSocketAddress("localhost", port), 0);
        server.createContext("/test", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                var stream = exchange.getResponseBody();
                var resp = "<html>Hooray! my mememe on port " + port + "!</html>";
                exchange.sendResponseHeaders(200, resp.length());
                stream.write(resp.getBytes());
                stream.flush();
                stream.close();
            }
        });
        server.start();
    }
}
