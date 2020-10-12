/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author user
 */
public class File2 {
    public static void main(String[] args) throws IOException {
        File f2= new File("demo.txt");
       if(f2.exists()){
            System.out.println("FIle alreadt exists");
            System.exit(0);
        }
        
        PrintWriter pw2= new PrintWriter(f2);
        pw2.println("John abraham 40 \n aksay kumar 50");
        
        
    }
    
}
