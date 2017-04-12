/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author hdsan
 */
public class IOController {
    
    private static final String path = "library.txt";

    public static void create() {
        File f = new File(path);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeFile(Object obj) {
        BufferedWriter bw = null;

        create();
        try {
            bw = new BufferedWriter(new FileWriter(path, true));
            bw.write(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
