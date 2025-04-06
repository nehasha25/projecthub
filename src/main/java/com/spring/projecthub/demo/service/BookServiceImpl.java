package com.spring.projecthub.demo.service;

import com.spring.projecthub.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl {

    private List<Book> books = new ArrayList<>();
    private BookServiceImpl() {
        //sample data for books
        books.add(new Book(1, "Fault in our Star", "john"));
        books.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book(2, "1984", "George Orwell"));
        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
    }

    public List<Book> findAllBooks() {
        return books;
    }


    public Book findBookById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);

    }

    public void deleteAllBooks() {
        books.clear();
    }
}
