package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.BookModel;
import org.academiadecodigo.bootcamp.view.LibraryView;

import java.util.LinkedList;
import java.util.List;

public class BookServiceImplementation implements BookService {

    private List<BookModel> books  = new LinkedList<>();

    @Override
    public BookModel get(String title) {

        for (BookModel book : books) {
            if (book.getTitle().equals(title)) {
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
    public void remove(BookModel bookModel) {

        books.remove(bookModel);

    }
}
