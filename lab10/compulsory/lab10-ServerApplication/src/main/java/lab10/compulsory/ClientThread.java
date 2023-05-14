package lab10.compulsory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class ClientThread extends Thread {
    private Socket socket = null ;
    public ClientThread (Socket socket) { this.socket = socket ; }
    public void run () {
        try {
            // Get the request from the input stream: client → server
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            String command = in.readLine();
            // Send the response to the output stream: server → client
            PrintWriter out = new PrintWriter(socket.getOutputStream());

            switch (command) {
                case "exit":
                    out.println("Application is stopping ...");
                    out.flush();
                    socket.close();
                    break;
                default:
                    out.println("Command not found");
                    out.flush();
                    break;
            }
        } catch (IOException e) {
            System.err.println("Communication error... " + e);
        } finally {
            try {
                socket.close(); // or use try-with-resources
            } catch (IOException e) { System.err.println (e); }
        }
    }
}