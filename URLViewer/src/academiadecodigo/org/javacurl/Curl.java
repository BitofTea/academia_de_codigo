package academiadecodigo.org.javacurl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Curl {


    public static void main(String[] args) {

        String link = "https://www.pinterest.com/";


        try {
            //criar uma ligação
            URL url = new URL(link);


            BufferedReader urlReader = new BufferedReader((new InputStreamReader(url.openStream())));
            System.out.println("connect to url");


            String line = urlReader.readLine();

            while (line != null) {

                System.out.println(line);
                line = urlReader.readLine();

            }

            urlReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
