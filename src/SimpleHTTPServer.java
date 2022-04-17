import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHTTPServer {

    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        while (true) {
            Socket clientSocket = server.accept();
            // 1. Read HTTP request from the client socket.
            // 2. Prepare an HTTP response.
            // 3. Send HTTP response to the client.
            // 4. Close the socket.
            InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (!line.isEmpty()) {
                System.out.println(line);
                line = br.readLine();
            }
        }
    }
}
