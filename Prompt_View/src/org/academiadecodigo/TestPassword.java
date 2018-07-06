package org.academiadecodigo;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class TestPassword {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);

        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("What is your name?");

        PasswordInputScanner scanner = new PasswordInputScanner();
        scanner.setMessage("what is your password?");

        String name = prompt.getUserInput(question1);
        String password = prompt.getUserInput(scanner);

        System.out.println("User's name: " + name + " | password: " + password);

    }




}
