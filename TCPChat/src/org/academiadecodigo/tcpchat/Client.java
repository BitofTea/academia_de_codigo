package org.academiadecodigo.tcpchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.DatagramSocket;
import java.net.Socket;


public class Client {


    public static void main(String[] args) {

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        while (line != null){
            System.out.println(line);
            line = reader.readLine();
        }*/


        String hostName = "localhost";
        int portNumber = 8000;
        Socket socket = null;


        try {
            //Abre uma ligação/socket com o servidor, bloqueia enquanto espera.
            Socket clientSocket = new Socket(hostName, portNumber);
            System.out.println("connected");
            //escreve o texto, linha, de 'System in' para o outputStream do server(socket)
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            while (!clientSocket.isClosed()) {


                String line = in.readLine();
                out.println(socket.getInetAddress() + ":" + line + "\n");

                while (line != null){

                    out.print(line);
                    out.flush();
                    System.out.println(line);
                    line = in.readLine();

                }


            }


            clientSocket.close();


        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }


    }


}
