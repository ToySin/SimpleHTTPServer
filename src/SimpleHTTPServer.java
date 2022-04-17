import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class SimpleHTTPServer {

    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        while (true) {
            // 1. Read HTTP request from the client socket.
            // 2. Prepare an HTTP response.
            // 3. Send HTTP response to the client.
            // 4. Close the socket.

            try (Socket clientSocket = server.accept()) {

                InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
                BufferedReader br = new BufferedReader(isr);

                String line;
                while (!(line = br.readLine()).isEmpty())
                    System.out.println(line);

                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                clientSocket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            }
        }
    }
}
