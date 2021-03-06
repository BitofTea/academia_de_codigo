import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.util.LinkedList;
import java.util.List;

public class LibraryController {


    private ViewUserInteraction view;
    private List<BookModel> books;

    public LibraryController() {
        view = new ViewUserInteraction();
        books = new LinkedList<>();
    }

    public void init() {

        int options = view.showMenu();
        boolean exit = false;

        while (!exit) {
            switch (options) {

                case 1:
                    view.listBook(books);
                    break;
                case 2:
                    view.addBook();
                    break;
                default:
                    exit = true;
            }
        }

    }

}
