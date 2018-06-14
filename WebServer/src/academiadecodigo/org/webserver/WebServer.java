package academiadecodigo.org.webserver;

import java.io.*;
import java.net.DatagramPacket;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.CharBuffer;

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
            System.out.println("Opening server...");
            serverSocket = new ServerSocket(portNumber);

            System.out.println("Waiting for client...");
            clientSocket = serverSocket.accept();

            //recebe a mensagem do cliente e imprime no ecrâ (setup input and output streams)
            BufferedOutputStream out = new BufferedOutputStream(clientSocket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // ler o request da input stream do cliente
            String request = readRequest(in);

            // 1. descobrir o ficheiro a ler a partir da string request

            while (true){

                if (request.contains("GET")){
                    System.out.println("GET is reading");
                }
            }


            // 2. construir o header em funcao do ficheiro a ler


            // para ja, vamos ignorar o request e servir sempre o index.html
            File file = new File("index.html");
            String header = "HTTP/1.0 200 Document Follows\r\n" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "Content-Length: " + file.length() + "\r\n" +
                    "\r\n";


            // 3. escrever para o output stream o header e o ficheiro (usando fileinputstream)
            out.write(header.getBytes());
            FileInputStream inputStream = new FileInputStream(file);
            int b = inputStream.read();

            while (b != -1) {
                out.write(b);
                b = inputStream.read();
            }

            out.flush();
            out.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readRequest(BufferedReader in) {

        String request = "";
        String line = null;


        try {
            line = in.readLine();

            while (line != null && !line.isEmpty()) {
                request += line + "\n";
                line = in.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return request;
    }
}