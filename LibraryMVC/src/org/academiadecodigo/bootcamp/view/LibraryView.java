package org.academiadecodigo.bootcamp.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.model.BookModel;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.List;

//A apresentação, visualização = view.
//O trabalho na Views(designers) separado de outras layers(developers)

public class LibraryView {

    private Prompt prompt = new Prompt(System.in, System.out);

    public int showMenu() {

        String[] options = {"List Books", "Add Book", "Remove Book", "Get Book", "Exit"};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("Choose your search option's number.");

        int answerIndex = prompt.getUserInput(scanner);

        System.out.println("User chose " + options[answerIndex - 1]);

        return answerIndex;
    }


    public void listBook(List<BookModel> books) {

        //if(books.size() == 0){ //--- existe método 'isEmpty()' na docs. do java - interface List<E>
        //System.out.println("No books");
        //return;
        //}

        if (books.isEmpty()) {
            System.out.println("No books");
            return;
        }

        for (BookModel i : books) {
            System.out.print(i.getTitle() + " | ");

        }
    }


    public BookModel addBook() {

        StringInputScanner titleScanner = new StringInputScanner();
        titleScanner.setMessage("What is the book title?");

        StringInputScanner authorScanner = new StringInputScanner();
        authorScanner.setMessage("What is the book author's name?");

        IntegerInputScanner yearScanner = new IntegerInputScanner();
        yearScanner.setMessage("What is the book edition's year?");

        String title = prompt.getUserInput(titleScanner);
        String name = prompt.getUserInput(authorScanner);
        int year = prompt.getUserInput(yearScanner);

        BookModel book = new BookModel();

        book.setTitle(title);
        book.setAuthor(name);
        book.setYear(year);

        return book;

    }

    public BookModel removeBook(){


    }
}

