package org.example.Repository;

import org.example.Model.DTO.BookDTO;
import org.example.config.BookHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.awt.print.Book;
import java.util.List;

public class BookRepository {

    Session session = BookHibernateUtil.getSessionFactory().openSession();

    public void addBook(BookDTO Book) {
        Transaction transaction = session.beginTransaction();
        session.persist(Book);
        transaction.commit();
    }

    public BookDTO getBook(String id) {
        return session.find(BookDTO.class,id);
    }

    public void deleteBook(String id) {
        Transaction transaction = session.beginTransaction();
        session.remove(session.find(BookDTO.class,id));
        transaction.commit();
    }

    public void updateBook(BookDTO Book) {
        Transaction transaction = session.beginTransaction();
        session.merge(Book);
        transaction.commit();
    }

    public List<Book> getAll() {
        List<Book> bookList = session.createQuery("FROM Book", Book.class).list();
        return bookList;
    }
}
