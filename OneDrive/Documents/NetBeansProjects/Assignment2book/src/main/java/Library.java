/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;
import java.util.ArrayList;
/**
 *
 * @author hdsan
 */
public class Library {
    
    private ArrayList<Book> books, signedOut;

    public Library() {
        books = new ArrayList<Book>();
        signedOut = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> getSignedOut() {
        return signedOut;
    }
}
