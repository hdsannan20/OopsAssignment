/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;
import javax.swing.*;
/**
 *
 * @author hdsan
 */
public class MainScreen extends JFrame{
     
    public MainScreen() {
        super("Library System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LibraryView libraryView = new LibraryView();

        setContentPane(libraryView);
        setSize(900, 600);
        setLocationByPlatform(true);
        setVisible(true);
    }
}
