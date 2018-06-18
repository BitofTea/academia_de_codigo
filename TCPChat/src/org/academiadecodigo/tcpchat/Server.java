package org.academiadecodigo.tcpchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {


        int portNumber = 8000; // Integer.parseInt(args[0]);
        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        try {
            //á espera da ligação do cliente.
            serverSocket = new ServerSocket(portNumber);
            clientSocket = serverSocket.accept();


            //recebe a mensagem do cliente e imprime no ecrâ (setup input and output streams)
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String line = in.readLine();
            //System.out.println();


            while (true) {

                line = in.readLine();


                if (line == null || line.equals("/quit")) {

                    System.out.println("client" + clientSocket.getInetAddress() + "has left.");
                    closeSocket(clientSocket);
                    break;
                }
                System.out.println(clientSocket.getInetAddress() + ":" + line);
                out.println(clientSocket.getInetAddress() + ":" + line);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void closeSocket(Socket socket) {

        if(socket == null){

            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
