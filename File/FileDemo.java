/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author user
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");
        if (f.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        PrintWriter pw= new PrintWriter(f);
        pw.print("John t ");
        pw.println(90);
        pw.print("Eric k ");
        pw.println(85);
        pw.close();    
    }
    
}
