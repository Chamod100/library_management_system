package org.example.Service;

import org.example.Model.DTO.BookDTO;
import org.example.Repository.BookRepository;

import java.awt.print.Book;
import java.util.List;

public class BookService {

    BookRepository BookRepository = new BookRepository();

    public void addBook(BookDTO bookDTO) {
        BookRepository.addBook(bookDTO);
    }

    public BookDTO getBook(String id){
        return BookRepository.getBook(id);
    }

    public void deleteBook(String id){
        BookRepository.deleteBook(id);
    }

    public void updateBook(BookDTO bookDTO){
        BookRepository.updateBook(bookDTO);
    }

    public List<Book> getAll(){
        return BookRepository.getAll();
    }

}