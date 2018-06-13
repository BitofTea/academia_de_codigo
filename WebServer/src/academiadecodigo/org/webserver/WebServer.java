package academiadecodigo.org.webserver;

import java.io.*;
import java.net.DatagramPacket;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {


    private StatusType statusType;
    //private String[] args;
    int portNumber = 8080; // Integer.parseInt(args[0]);
    ServerSocket serverSocket = null;
    Socket clientSocket = null;


    public WebServer(int portNumber) {
    }

    public void start() {


        try {
            //á espera da ligação do cliente.
            serverSocket = new ServerSocket(portNumber);
            clientSocket = serverSocket.accept();

            //recebe a mensagem do cliente e imprime no ecrâ (setup input and output streams)
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            //String line = in.readLine();



            while (true) {

                String line = in.readLine();
                File file = new File("/index.html");
                byte[] response = new byte[1024];


                DatagramPacket receivePacket= new DatagramPacket(response, response.length);



                if (line.contains("GET")) {

                    System.out.println("GET is read");

                    if (line.contains(" / ")) {

                        System.out.println("index route detected");





                        /*if (line.contains(statusType)) {

                            System.out.println();
                        }*/



                    /*System.out.println("HTTP/1.0 200 Document Follows\r\n\n" +
                            "Content-Type: text/html; charset=UTF-8\r\n\n" +
                            "Content-Length: <file_byte_size> \r\n\n" +
                            "\r\n");


                    break;*/


                    }

                    System.out.println(line);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}