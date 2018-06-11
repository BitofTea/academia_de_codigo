package org.academiadecodigo.mapeditor.utils;

import java.io.*;


public class FileManager {

    public static void save(String file_name, String data) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(file_name), true);
        writer.print(data);

        closeStream(writer);
    }


    public static String read(String file_name) throws FileNotFoundException {
        String data = "";
        BufferedReader reader = new BufferedReader(new FileReader(file_name));

        try {
            String line = reader.readLine();

            while (line != null) {
                data += line + "\n";
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    private static void closeStream(Closeable stream) {
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
