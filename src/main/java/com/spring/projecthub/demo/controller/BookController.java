package com.spring.projecthub.demo.controller;

import com.spring.projecthub.demo.model.Book;
import com.spring.projecthub.demo.service.BookServiceImpl;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("spring/books")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/")
    public String check() {
        return "Welcome to book API";
    }

    @GetMapping("/findall")
    public List<Book> findAllBooks () {
        return bookService.findAllBooks();
    }

    @GetMapping("/findById/{id}")
    public Book findByID(@PathVariable int id) {
        return bookService.findBookById(id);
    }

    @GetMapping("/findByIds")
    public Book findByIDS(@PathParam("20") int id) {

        return bookService.findBookById(id);
    }

    @DeleteMapping("deleteBooks")
    public String deleteAllBooks() {
        bookService.deleteAllBooks();
        return "All books have been deleted successfully";
    }
}
