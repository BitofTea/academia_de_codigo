package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.BookModel;
import org.academiadecodigo.bootcamp.services.BookService;
import org.academiadecodigo.bootcamp.services.BookServiceImplementation;
import org.academiadecodigo.bootcamp.view.LibraryView;

import java.util.List;



public class LibraryController {


    private LibraryView view;
    private BookService  bookService;


    public LibraryController() {
        view = new LibraryView(this);
        bookService = new BookServiceImplementation();

    }

    public void init() {

        boolean exit = false;

        while (!exit) {

            int options = view.showMenu();

            switch (options) {

                case 1:
                    view.listBook();
                    break;

                case 2:
                    view.addBook();
                    break;

                case 3:
                    view.removeBook();
                    break;

                case 4:
                    view.getBook();
                    break;

                default:
                    exit = true;
                    break;

            }

        }

    }

    public BookModel getBook(String title) {
        return bookService.get(title);
    }

    public void deleteBook(String bookTitle) {
        bookService.remove(bookTitle);
    }

    public List<BookModel> list() {
        return bookService.list();
    }

    public void createBook(BookModel book) {
        bookService.add(book);
    }
}





