package org.academiadecodigo.udpsender;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPEchoer {

    public static void main(String[] args) {

        if (args.length < 1) {
            throw new IllegalArgumentException("usage: <port>");

        }

        DatagramSocket socket = null;

        int portNumber = Integer.parseInt(args[0]);

        try {

            byte[] sendBuffer;
            byte[] recvBuffer = new byte[1024];

            //opening socket on port + port number
            socket = new DatagramSocket(portNumber);

            //Se quisermos continuar a receber pacotes, ficar á escuta, fazemos um loop, neste caso com o while
            while (true) {

                DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
                socket.receive(receivePacket); // this method blocks execution until packet is received - waiting for pockets...

                //process the client message and transform it to upper case
                String upperString = new String(recvBuffer, receivePacket.getOffset(), receivePacket.getLength()).toUpperCase();
                //create the buffer using the string
                sendBuffer = upperString.getBytes();


                receivePacket.setData(sendBuffer);
                //send the Packet
                socket.send(receivePacket);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }


    }


}
