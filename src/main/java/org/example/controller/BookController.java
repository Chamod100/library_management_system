package org.example.controller;

import org.example.Model.DTO.BookDTO;
import org.example.Service.BookService;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BookController {

    BookService bookService = new BookService();

    @PostMapping("add/book")
    public void addBook(@RequestBody BookDTO bookDTO){
        bookService.addBook(bookDTO);
    }

    @GetMapping("get/book/{id}")
    public BookDTO getBook(@PathVariable String id){
        return bookService.getBook(id);
    }

    @DeleteMapping("delete/book/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);
    }

    @PostMapping("update/book")
    public void updateBook(@RequestBody BookDTO bookDTO){
        bookService.updateBook(bookDTO);
    }

    @GetMapping("book/getAll")
    public List<Book> getAll(){
        return bookService.getAll();
    }

}