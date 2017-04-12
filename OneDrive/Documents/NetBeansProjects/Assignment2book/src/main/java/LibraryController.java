/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import main.java.Book;
import main.java.Library;
import main.java.LibraryView;
/**
 *
 * @author hdsan
 */
public class LibraryController {
      private Library library;
    private LibraryView libraryView;

    public LibraryController(Library library, LibraryView libraryView) {
        this.library = library;
        this.libraryView = libraryView;
    }

    public void signIn(String name) {
        Book book = getSignedOutBook(name);
        if (book != null) {
            library.getSignedOut().remove(book);
            library.getBooks().add(book);
            libraryView.setResults(name + " has been signed in.");
        } else {
            libraryView.setResults("That book is not signed out.");
        }
    }

    public void signOut(String name) {
        Book book = null;
        for (Book b : library.getBooks())
            if (b.getName().equalsIgnoreCase(name))
                book = b;
        if (book != null) {
            library.getBooks().remove(book);
            library.getSignedOut().add(book);
            libraryView.setResults(name + " has been signed out.");
        } else {
            libraryView.setResults("That book name does not exist");
        }
    }

    private Book getSignedOutBook(String name) {
        for (Book book : library.getSignedOut())
            if (book.getName().equalsIgnoreCase(name))
                return book;
        return null;
    }

    public void getBookByName(String name) {
        if (name.equals("")) {
            libraryView.setResults("Please enter a book name.");
        } else {
            for (Book book : library.getBooks())
                if (book.getName().equalsIgnoreCase(name))
                    libraryView.setResults(book.toString());
        }
    }

    public void getBooksByAuthor(String author) {
        if (author.equals("")) {
            libraryView.setResults("Please enter a book author.");
        } else {
            String finalStr = "";
            for (int i = 0; i < library.getBooks().size(); i++) {
                Book book = library.getBooks().get(i);
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    finalStr += book + "\n";
                }
            }
            libraryView.setResults(finalStr);
        }
    }

    public void getBooksByGenre(String genre) {
        if (genre.equals("")) {
            libraryView.setResults("Please enter a book genre.");
        } else {
            String finalStr = "";
            for (int i = 0; i < library.getBooks().size(); i++) {
                Book book = library.getBooks().get(i);
                if (book.getGenre().equalsIgnoreCase(genre)) {
                    finalStr += book + "\n";
                }
            }
            libraryView.setResults(finalStr);
        }
    }

    public void addBook(String name, String author, String genre) {
        if (name.equals("") || author.equals("") || genre.equals("")) {
            libraryView.setResults("Please fill out all book information.");
        } else {
            Book book = null;
            for (Book b : library.getBooks())
                if (b.getName().equalsIgnoreCase(name))
                    book = b;
            if (book == null) {
                library.getBooks().add(new Book(name, author, genre));
                libraryView.setResults("Book has been added.");
            } else {
                libraryView.setResults("That book is already in the library.");
            }
        }
    }

    public void getAllBooks() {
        String finalStr = "";
        for (int i = 0; i < library.getBooks().size(); i++) {
            Book book = library.getBooks().get(i);
            finalStr += (i + 1) + ". " + book + "\n";
        }
        libraryView.setResults(finalStr);
    }

    public void getSignedOutBooks() {
        String finalStr = "";
        for (int i = 0; i < library.getSignedOut().size(); i++) {
            Book book = library.getSignedOut().get(i);
            finalStr += (i + 1) + ". " + book + "\n";
        }
        libraryView.setResults(finalStr);
    }

    public void save() {
        IOController.writeFile(library);
        libraryView.setResults("Saved.");
    }
}
