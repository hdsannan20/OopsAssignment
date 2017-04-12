/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.util.ArrayList;
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
public class LibraryTest {
    
    public LibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBooks method, of class Library.
     */
    @Test
    public void testGetBooks() {
        System.out.println("getBooks");
        Library instance = new Library();
        ArrayList<Book> expResult = null;
        ArrayList<Book> result = instance.getBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSignedOut method, of class Library.
     */
    @Test
    public void testGetSignedOut() {
        System.out.println("getSignedOut");
        Library instance = new Library();
        ArrayList<Book> expResult = null;
        ArrayList<Book> result = instance.getSignedOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
