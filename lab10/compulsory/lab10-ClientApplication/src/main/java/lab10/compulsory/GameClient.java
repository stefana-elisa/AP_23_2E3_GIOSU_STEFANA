package lab10.compulsory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GameClient {
    public static void main (String[] args) throws IOException {
        String serverAddress = "127.0.0.1"; // The server's IP address
        int PORT = 8100; // The server's port
        try (
                Socket socket = new Socket(serverAddress, PORT);
                PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader (
                        new InputStreamReader(socket.getInputStream())) ) {

            boolean shouldExit = false;

            while (!shouldExit) {
                System.out.println("Enter your command: ");
                Scanner scanner = new Scanner(System.in);
                String command = scanner.nextLine();
                String response;

                switch (command) {
                    case "exit":
                        shouldExit = true;
                        out.println(command);
                        response = in.readLine();
                        break;
                    default:
                        out.println(command);
                        response = in.readLine();
                        break;
                }
                System.out.println(response);
            }
        } catch (UnknownHostException e) {
            System.err.println("No server listening... " + e);
        }
    }
}