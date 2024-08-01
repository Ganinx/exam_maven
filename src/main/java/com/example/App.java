package com.example;

import com.example.business.Book;
import com.example.business.service.BookService;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println(BookService.getBook());

    }

    public static void ajoutBook(){
        Book book = new Book("Harry potter","J.K Rollings",1997);
        BookService.addBook(book);
    }

}
