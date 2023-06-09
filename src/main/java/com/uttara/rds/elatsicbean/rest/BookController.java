package com.uttara.rds.elatsicbean.rest;


import com.uttara.rds.elatsicbean.entity.Book;
import com.uttara.rds.elatsicbean.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping
    public List<Book> findBooks() {
        return bookRepository.findAll();
    }


    @GetMapping("/{id}")
    public Book findBook(@PathVariable int id) {
        return  bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not available"));

    }

}
