import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Connection {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(4444)) {
            Socket socket = serverSocket.accept();
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = input.readLine();
            System.out.println(message);
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
            output.println("Do you want to connect to the server?");
            socket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
