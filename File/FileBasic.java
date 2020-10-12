/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class FileBasic {
    public static void main(String[] args) {
        File f = new File ("Basic.txt");
        
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.println("christopher henry gayle");
            pw.println(333);
            pw.close();
        } catch (IOException e) {
            System.out.println("File not found or exists");
        }
        try{
            Scanner input = new Scanner(f);
            String name= input.nextLine();
            int age = input.nextInt();
            System.out.println(name+"\n"+age);
        }
        catch(IOException e){
            System.out.println("Name and Id  not found");}
        File f2 = new File("writer.txt");
        
        try {
            FileWriter fw = new FileWriter(f2,true);
            fw.write("i am a human being . \n");
            fw.flush();
            /*fw.write(f2.length()+"this is the size .\n");
            fw.flush();*/
        } catch (IOException ex) {
            System.out.println("error");
        }
        
        
    }
    
}
