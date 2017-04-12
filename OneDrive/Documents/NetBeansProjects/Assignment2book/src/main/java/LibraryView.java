/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import main.java.LibraryController;
import main.java.Library;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author hdsan
 */
public class LibraryView extends JPanel implements ActionListener {
    private LibraryController libraryController;
    private Library library;

    private JLabel lblLibrary, lblSearchActions, lblSearchText, lblSearchResults, lblSignOutName, lblSignOutBook, lblGet, lblAddBook, lblBookName, lblBookAuthor, lblBookGenre;
    private JRadioButton rbName, rbAuthor, rbGenre;
    private JTextField txtSearch, txtSignOut, txtBookName, txtBookAuthor, txtBookGenre;
    private JTextArea txtResults;
    private JButton btnSearch, btnSignOut, btnSignIn, btnAllBooks, btnSignedOutBooks, btnAddBook, btnSaveLibrary;
    private ButtonGroup searchGroup;

    public LibraryView() {
        library = new Library();
        libraryController = new LibraryController(library, this);

        setLayout(null);

        lblLibrary = new JLabel("Library Actions");
        lblLibrary.setBounds(50, 10, 150, 30);

        lblSearchActions = new JLabel("Search:");
        lblSearchActions.setBounds(75, 50, 150, 30);

        rbName = new JRadioButton("By Name");
        rbName.setBounds(100, 80, 150, 30);

        rbAuthor = new JRadioButton("By Author");
        rbAuthor.setBounds(100, 110, 150, 30);

        rbGenre = new JRadioButton("By Genre");
        rbGenre.setBounds(100, 140, 150, 30);

        lblSearchText = new JLabel("Search String:");
        lblSearchText.setBounds(75, 170, 150, 30);

        txtSearch = new JTextField();
        txtSearch.setBounds(100, 200, 150, 20);

        btnSearch = new JButton("Search");
        btnSearch.addActionListener(this);
        btnSearch.setBounds(100, 230, 100, 25);

        lblSearchResults = new JLabel("Results:");
        lblSearchResults.setBounds(75, 290, 150, 30);

        txtResults = new JTextArea();

        JScrollPane scroll = new JScrollPane (txtResults, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(100, 320, 500, 200);

        searchGroup = new ButtonGroup();
        searchGroup.add(rbName);
        searchGroup.add(rbAuthor);
        searchGroup.add(rbGenre);

        //lblBookActions = new JLabel("Book Actions");
        //lblBookActions.setBounds(325, 10, 300, 30);

        lblSignOutBook = new JLabel("Sign In/Out Book:");
        lblSignOutBook.setBounds(275, 50, 150, 30);

        lblSignOutName = new JLabel("Book Name:");
        lblSignOutName.setBounds(300, 80, 150, 30);

        txtSignOut = new JTextField();
        txtSignOut.setBounds(300, 110, 150, 20);

        btnSignIn = new JButton("Sign In");
        btnSignIn.addActionListener(this);
        btnSignIn.setBounds(300, 140, 100, 25);

        btnSignOut = new JButton("Sign Out");
        btnSignOut.addActionListener(this);
        btnSignOut.setBounds(300, 170, 100, 25);

        lblGet = new JLabel("Get:");
        lblGet.setBounds(475, 50, 150, 30);

        btnAllBooks = new JButton("All Books");
        btnAllBooks.addActionListener(this);
        btnAllBooks.setBounds(500, 80, 150, 25);

        btnSignedOutBooks = new JButton("Signed Out Books");
        btnSignedOutBooks.addActionListener(this);
        btnSignedOutBooks.setBounds(500, 110, 150, 25);

        btnSaveLibrary = new JButton("Save Library");
        btnSaveLibrary.addActionListener(this);
        btnSaveLibrary.setBounds(500, 140, 150, 25);

        lblAddBook = new JLabel("Add Book:");
        lblAddBook.setBounds(675, 50, 150, 30);

        lblBookName = new JLabel("Name:");
        lblBookName.setBounds(700, 80, 150, 30);

        txtBookName = new JTextField();
        txtBookName.setBounds(700, 110, 150, 20);

        lblBookAuthor = new JLabel("Author:");
        lblBookAuthor.setBounds(700, 140, 150, 30);

        txtBookAuthor = new JTextField();
        txtBookAuthor.setBounds(700, 170, 150, 20);

        lblBookGenre = new JLabel("Genre:");
        lblBookGenre.setBounds(700, 200, 150, 30);

        txtBookGenre = new JTextField();
        txtBookGenre.setBounds(700, 230, 150, 20);

        btnAddBook = new JButton("Add Book");
        btnAddBook.addActionListener(this);
        btnAddBook.setBounds(700, 260, 100, 25);

        add(btnAddBook);
        add(btnSaveLibrary);
        add(lblAddBook);
        add(lblBookName);
        add(txtBookName);
        add(txtBookAuthor);
        add(lblBookAuthor);
        add(lblBookGenre);
        add(txtBookGenre);

        add(btnSignedOutBooks);
        add(btnAllBooks);
        add(lblGet);
        add(lblSignOutName);
        add(btnSearch);
        add(btnSignIn);
        add(btnSignOut);
        add(lblSignOutBook);
        add(txtSignOut);
        add(scroll);
        add(lblSearchResults);
        add(lblSearchText);
        add(txtSearch);
        add(rbName);
        add(rbGenre);
        add(rbAuthor);
        add(lblSearchActions);
        add(lblSearchText);
        add(lblLibrary);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAllBooks) {
            libraryController.getAllBooks();
        } else if (e.getSource() == btnAddBook) {
            libraryController.addBook(txtBookName.getText(), txtBookAuthor.getText(), txtBookGenre.getText());
        } else if (e.getSource() == btnSignOut) {
            libraryController.signOut(txtSignOut.getText());
        } else if (e.getSource() == btnSignIn) {
            libraryController.signIn(txtSignOut.getText());
        } else if (e.getSource() == btnSignedOutBooks) {
            libraryController.getSignedOutBooks();
        } else if (e.getSource() == btnSearch) {
            if (rbName.isSelected()) {
                libraryController.getBookByName(txtSearch.getText());
            } else if (rbAuthor.isSelected()) {
                libraryController.getBooksByAuthor(txtSearch.getText());
            } else if (rbGenre.isSelected()) {
                libraryController.getBooksByGenre(txtSearch.getText());
            }
        } else if (e.getSource() == btnSaveLibrary) {
            libraryController.save();
        }
    }

    public void setResults(String text) {
        txtResults.setText(text);
    }
}
