package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.BookModel;

import java.util.List;

public interface BookService {


    BookModel get(String title);

    void add(BookModel bookModel);

    List<BookModel> list();

    void remove(BookModel bookModel);
}
