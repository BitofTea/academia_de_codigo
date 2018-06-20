package org.acdemiadecodigo.webchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {


    public static void main(String[] args) {

        ChatServer server = new ChatServer(8000);
        server.start();


    }


    private Socket clientSocket;
    private ServerSocket serverSocket;
    private BufferedReader inputBufferedReader;
    private ChatClient chatClient;

    public ChatServer(int port) {
        chatClient = new ChatClient("localhost", 8000);


    }

    public void setupSocketStream() throws IOException {
        inputBufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

    }

    public void start() {

        try {
            serverSocket = new ServerSocket(8000);
            clientSocket = serverSocket.accept();
            System.out.println("client " + clientSocket.getInetAddress() + "entered the chat room");

            while (true) {

                String line = inputBufferedReader.readLine();

                if (line == null || line.equals("/quit")) {

                    System.out.println("client exited chat room");
                    break;

                }

                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            close();

            ExecutorService fixedPool = Executors.newFixedThreadPool(4);
            fixedPool.submit(this::start);
        }


    }

    private void close() {

        try {

            if (clientSocket != null) {
                clientSocket.close();

            }

            if (serverSocket != null) {
                serverSocket.close();

            }

        } catch (IOException e) {
            e.printStackTrace();


        }
    }

}


