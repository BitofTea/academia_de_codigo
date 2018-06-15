package academiadecodigo.org.webserver;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientHandler {

    int portNumber = 8080;
    ServerSocket serverSocket = null;
    Socket client = null;

    public void start() {



        try {
            System.out.println("Opening server...");
            serverSocket = new ServerSocket(portNumber);

            System.out.println("Waiting for client...");
            client = serverSocket.accept();

            System.out.println("serving request...");
            Request request = new Request(readRequest(client));

            //recebe a mensagem do cliente e imprime no ecrâ (setup input)
            BufferedOutputStream out = new BufferedOutputStream(client.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));



        } catch (IOException e) {
            System.out.println("error processing client...shuting down");
            e.printStackTrace();
        }


    }
}