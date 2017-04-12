/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hdsan
 */
     
public class BookTest {
    Book validBook;
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validBook = new Book("As You Like It","William Shakespeare","Comedy");
    }
    
    @After
    public void tearDown() {
    }
 @Test
    public void testInvalidBook() {
        System.out.println("Test creation of invalid Book");
        try
        {
            Book invalidBook = new Book("As You Like It","William Shakespeare","Comedy");    
            fail("the invalid Book should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {            
        }
    }
    /**
     * Test of getName method, of class Book.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "As You Like It";
        String result = validBook.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Book.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "As You Like It";
        Book instance = null;
        validBook.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Book instance = null;
        String expResult = "William Shakespeare";
        String result = validBook.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class Book.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "";
        Book instance = null;
        instance.setAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenre method, of class Book.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        Book instance = validBook;
        String expResult = "Comedy";
        String result = validBook.getGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGenre method, of class Book.
     */
    @Test
    public void testSetGenre() {
        System.out.println("setGenre");
        String genre = "Comedy";
        Book instance = null;
        validBook.setGenre(genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
}
