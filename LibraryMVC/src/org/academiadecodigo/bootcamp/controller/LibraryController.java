package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.services.BookService;
import org.academiadecodigo.bootcamp.services.BookServiceImplementation;
import org.academiadecodigo.bootcamp.view.LibraryView;



//Lida com as acções do user na interface, acesso a dados e a business logic, tudo no mesmo lugar.

public class LibraryController {


    private LibraryView view;
    private BookService bookService;


    public LibraryController() {
        view = new LibraryView();
        bookService = new BookServiceImplementation();


    }

    public void init() {

        boolean exit = false;

        while (!exit) {

            int options = view.showMenu();

            switch (options) {

                case 1:
                    view.listBook(bookService.list());
                    break;

                case 2:
                    bookService.add(view.addBook());
                    break;

                case 3:
                    bookService.remove(view.removeBook());
                    break;

                case 4:
                    view.getBook(bookService.get(bookService.get(String title));
                    break;

                default:
                    exit = true;
                    break;
            }

        }
    }

}
