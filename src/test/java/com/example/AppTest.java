package com.example;

import com.example.business.Book;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 

{

    @Test
    public void BookTest(){
        Book book = new Book("Wow","Chritie Golden",2011);
        Assert.assertEquals(book.getAge(),13);
    }
}
