package com.example.business.service;

import com.example.business.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

import static com.example.business.HibernateConfig.getSessionFactory;

public class BookService {


    public static void addBook(Book book){
        Transaction transaction = null;
        try (Session session = getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(book);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public static List<Book> getBook(){
        try (Session session = getSessionFactory().openSession()) {
            return session.createQuery("from Book", Book.class).list();
        }
    }

}
