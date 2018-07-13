package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.BookModel;

import java.util.LinkedList;
import java.util.List;

public class BookServiceImplementation implements BookService {

    private List<BookModel> books = new LinkedList<>();

    @Override
    public BookModel get (String bookTitle) {

        for (BookModel book : books) {
            if (bookTitle.equals(book.getTitle())) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void add(BookModel bookModel) {

        books.add(bookModel);

    }

    @Override
    public List<BookModel> list() {

        return books;
    }

    @Override
    public void remove(String bookTitle) {

        for (BookModel book : books) {
            if (bookTitle.equals(book.getTitle())) {
                books.remove(book);

            }
        }
    }
}

