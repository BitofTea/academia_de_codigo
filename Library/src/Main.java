import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class Main {

    public static void main(String[] args) {

        String[] options = {"title", "author", "year"};
        Prompt prompt = new Prompt(System.in, System.out);

        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("Choose your book search option's number");

        int answerIndex = prompt.getUserInput(scanner);
        System.out.println("You choosed " + options[answerIndex - 1]);



    }
}
