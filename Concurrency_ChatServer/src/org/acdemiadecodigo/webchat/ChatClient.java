package org.acdemiadecodigo.webchat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatClient {


    public static void main(String[] args) {

    }

    private Socket socket;
    private BufferedReader inputBufferedReader;
    private BufferedWriter outputBufferedReader;

    public ChatClient(String serverAddress, int serverPort) {

        try {
            socket = new Socket(serverAddress, serverPort);
            setupSocketStreams();


        } catch (IOException e) {
            e.printStackTrace();

        }

        String line = "";

        while ((!line.equals("/quit"))) {

            try {
                line = inputBufferedReader.readLine();

                outputBufferedReader.write(line);
                outputBufferedReader.newLine();
                outputBufferedReader.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        close();

    }

    private void setupSocketStreams() throws IOException {
        inputBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        outputBufferedReader = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

    }

    private void close() {

        try {
            if (socket != null) {
                System.out.println("socket is closed");
                socket.close();

            }
        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}





