package academiadecodigo.org.webserver;

public class Main {

    public static void main(String[] args) {
        WebServer webServer = new WebServer(8080);

        webServer.start();
    }


   /*String header = "HTTP/1.0 200 Document Follows\r\n\n"+
            "Content-Type: text/html; charset=UTF-8\r\n\n"+
            "Content-Length: <file_byte_size> \r\n\n"+
            "\r\n"


    String header = "HTTP/1.0 200 Document Follows\r\n\n"+
            "Content-Type: image/<image_file_extension> \r\n\"\n"+
            "Content-Length: <file_byte_size> \r\n\n"+
            "\r\n"


    String header = "HTTP/1.0 404 Not Found\n"+
            "Content-Type: text/html; charset=UTF-8\r\n\n"+
            "Content-Length: <file_byte_size> \r\n\n"+
            "\r\n"*/


}
