package org.academiadecodigo;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class Main {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);


        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("What is your name?");

        IntegerInputScanner question2 = new IntegerInputScanner();
        question2.setMessage("what is your password?");

        String name = prompt.getUserInput(question1);
        int password = prompt.getUserInput(question2);

        System.out.println("User's name:" + name + " | user's password: " + password);


    }
}
