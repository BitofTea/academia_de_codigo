package org.academiadecodigo.udpsender;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

    public static void main(String[] args) {

        if (args.length < 1) {
            throw new IllegalArgumentException("usage: <port>");

        }

        DatagramSocket socket = null;

        int portNumber = Integer.parseInt(args[0]);

        try {

            byte[] sendBuffer;
            byte[] recvBuffer = new byte[1024];


            socket = new DatagramSocket(portNumber);


            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
                socket.receive(receivePacket);

                String upperString = new String(recvBuffer, receivePacket.getOffset(), receivePacket.getLength()).toUpperCase();
                sendBuffer = upperString.getBytes();


                receivePacket.setData(sendBuffer);
                socket.send(receivePacket);

            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }


    }


}
