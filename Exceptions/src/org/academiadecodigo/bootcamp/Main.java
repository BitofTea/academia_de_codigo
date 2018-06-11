package org.academiadecodigo.bootcamp;


import org.academiadecodigo.bootcamp.exceptions.FileManager;
import org.academiadecodigo.bootcamp.exceptions.FileNotFoundException;
import org.academiadecodigo.bootcamp.exceptions.NotEnoughPermissionsException;
import org.academiadecodigo.bootcamp.exceptions.NotEnoughSpaceException;

public class Main {


    /**
     * Created by pantoninho on 22/05/16.
     */

    public static void main(String[] args) {

        FileManager fm = new FileManager(5);
        try {
            fm.getFile("batata");

        } catch (FileNotFoundException e) {


        }

        loginTest(); // try to create a file on disk without logging in first
        capacityTest(); // login and create too many files, making sure to log out
        invalidFileTest(); // try to get a file that doesn't exist

    }

    private static void loginTest() {

        FileManager fileManager = new FileManager(10);

        try {

            fileManager.createFile("bootcamp.txt");

        } catch (NotEnoughPermissionsException e) {

            System.out.println("Error creating file: " + e.getMessage());

        } catch (NotEnoughSpaceException e) {

            System.out.println("Error creating file " + e.getMessage());
        }
    }

    private static void capacityTest() {

        int maxFiles = 10;
        FileManager fileManager = new FileManager(maxFiles);

        try {

            fileManager.login();

            for (int i = 0; i < maxFiles + 1; i++) {

                String fileName = "file" + i + ".txt";
                fileManager.createFile(fileName);
                System.out.println("Created " + fileName);
            }

        } catch (NotEnoughPermissionsException e) {

            System.out.println("Error creating file: " + e.getMessage());

        } catch (NotEnoughSpaceException e) {

            System.out.println("Error creating file: " + e.getMessage());

        } finally {

            System.out.println("Logging out...");
            fileManager.logout();
        }
    }


    private static void invalidFileTest() {

        try {

            FileManager fileManager = new FileManager(10);
            fileManager.getFile("file10.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Error getting file: " + e.getMessage());
        }
    }

}
