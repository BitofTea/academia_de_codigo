package org.academiadecodigo;

import java.io.*;

public class CopyFile {


    public static void copy(String from, String to) throws IOException {

        FileInputStream inputStream = new FileInputStream(from);
        FileOutputStream outputStream = new FileOutputStream(to);

        byte[] buffer = new byte[1024];

        int b;

        //Atribuição e depois compara
        while ((b = inputStream.read(buffer)) != -1) {

            outputStream.write(buffer, 0, b);

        }

        inputStream.close();
        outputStream.close();

    }

}
