package org.academiadecodigo.web.util;

import java.io.IOException;
import java.net.ServerSocket;

public class WebServer {

    private ServerSocket socket;


    public WebServer(int port) throws IOException {

        System.out.println("connecting to port" + port);
        socket = new ServerSocket(port);

    }

    public void start(){
        socket client = null;

    }






}
