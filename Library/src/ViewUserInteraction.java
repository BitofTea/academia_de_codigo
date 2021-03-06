import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;


import java.util.List;

//A apresentação, visualização = view.
//Nota: incorporar no view alguns testes sanitários (sanity checks)?


public class ViewUserInteraction {


    Prompt prompt = new Prompt(System.in, System.out);


    public int showMenu() {

        String[] options = {"title", "author", "year"};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("Choose your search option's number.");

        int answerIndex = prompt.getUserInput(scanner);
        System.out.println("User choosed" + options[answerIndex]);


        return answerIndex;
    }


    public void listBook(List<BookModel> books) {




    }

    public void addBook() {


    }
}
