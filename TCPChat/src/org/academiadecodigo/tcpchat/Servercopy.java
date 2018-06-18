
package org.academiadecodigo.tcpchat.server;

        import java.io.*;
        import java.net.ServerSocket;
        import java.net.Socket;

public class ServerCopy {

    public static void main(String[] args) {

        int portNumber = 8000; // Integer.parseInt(args[0]);
        Socket clientSocket = null;
        ServerSocket serverSocket = null;


        try {

            while (true) {
                System.out.println("Waiting for clients...");

                serverSocket = new ServerSocket(portNumber);
                clientSocket = serverSocket.accept();

                System.out.println("Client " + clientSocket.getInetAddress() + " has joined.");

                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                while (true) {

                    String line = in.readLine();

                    if (line == null || line.equals("/quit")) {

                        System.out.println("Client " + clientSocket.getInetAddress() + " has left.");
                        closeSocket(clientSocket);
                        break;

                    }

                    System.out.println(clientSocket.getInetAddress() + ": " + line);
                    out.println(clientSocket.getInetAddress() + ": " + line);

                }

            }

        } catch (IOException e) {

            System.err.println("Error transmitting messages: " + e.getMessage());
            System.out.println("Closing socket...");
            closeSocket(serverSocket);
            closeSocket(clientSocket);

        }

    }

    private static void closeSocket(Closeable socket) {

        if (socket == null) {

            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


}