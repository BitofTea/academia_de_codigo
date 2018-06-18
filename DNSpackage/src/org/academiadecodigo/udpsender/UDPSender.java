package org.academiadecodigo.udpsender;

import java.io.IOException;
import java.net.*;

public class UDPSender {

    public static void main(String[] args) {


        if (args.length < 3) {
            throw new IllegalArgumentException("usage <host> <port> <message>");
        }

        String host = args[0];
        int port = Integer.parseInt(args[1]);
        String message = args[2];

        DatagramSocket socket = null;


            try {
                socket = new DatagramSocket();
                byte[] buffer = message.getBytes();

                while (!socket.isClosed()){
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getByName(host), port);

                    socket.send(packet);

                    packet = new DatagramPacket(buffer, buffer.length);
                    socket.receive(packet);
                    System.out.println(new String(packet.getData()).trim());
                }

            } catch (IOException e1) {
                e1.printStackTrace();
            }finally {


            if(socket != null);

            socket.close();
        }
    }


}
