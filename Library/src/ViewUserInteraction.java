import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.awt.print.Book;
import java.util.List;

public class ViewUserInteraction {

    private List<Book> books;
    private String[] options = {"title", "author", "year"};

    Prompt prompt = new Prompt(System.in, System.out);


    public void showMenu() {

        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("Choose your search option's number.");

        int answerIndex = prompt.getUserInput(scanner);
        System.out.println("User choosed" + options[answerIndex]);
    }


    public void listBook() {

    }

    public void add() {


    }
}
