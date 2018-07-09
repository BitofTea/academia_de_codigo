package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.BookModel;
import org.academiadecodigo.bootcamp.view.LibraryView;

import java.util.LinkedList;
import java.util.List;

public class LibraryController {


    private LibraryView view;
    private List<BookModel> books;

    public LibraryController() {
        view = new LibraryView();
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
