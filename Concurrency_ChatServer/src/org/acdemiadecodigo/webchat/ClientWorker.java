package org.acdemiadecodigo.webchat;

import java.awt.*;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientWorker implements Runnable{

    private Socket client;
    private TextArea textArea;

    ClientWorker(Socket client, TextArea textArea){
        this.client = client;
        this.textArea = textArea;

    }

    @Override
    public void run() {

        String line;
        BufferedReader in = null;
        PrintWriter out = null;


        in = new BufferedReader()




    }
}
