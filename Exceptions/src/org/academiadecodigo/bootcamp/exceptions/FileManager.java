package org.academiadecodigo.bootcamp.exceptions;

public class FileManager {

    private boolean logged;
    private File[] files;


    public FileManager(int noFiles) {
        this.logged = false;
        files = new File[noFiles];

    }

    public void login() {
        this.logged = true;

    }

    public void logout() {
        this.logged = false;

    }

    public File getFile(String name) throws FileNotFoundException {

        for (int i = 0; i < files.length; i++) {
            if (files[i] != null && name.equals(files[i].getName())) {
                return files[i];


            }

            throw new FileNotFoundException();

        }


    }