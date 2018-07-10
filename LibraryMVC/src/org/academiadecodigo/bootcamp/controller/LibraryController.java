package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.BookModel;
import org.academiadecodigo.bootcamp.view.LibraryView;

import java.util.LinkedList;
import java.util.List;

//Lida com as acções do user na interface, acesso a dados e a business logic, tudo no mesmo lugar.

public class LibraryController {


    private LibraryView view;
    private List<BookModel> books;

    public LibraryController() {
        view = new LibraryView();
        books = new LinkedList<>();
    }

    public void init() {

        boolean exit = false;

        while (!exit) {
            int options = view.showMenu();

            switch (options) {

                case 1:
                    view.listBook(books);
                    break;
                case 2:
                    books.add(view.addBook());
                    break;
                default:
                    exit = true;
                    break;
            }
        }
    }
}
