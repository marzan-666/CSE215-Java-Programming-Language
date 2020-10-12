/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer2k17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class apple {
    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");
        
        try{
        PrintWriter output = new PrintWriter (f);
        
        output.println("Md Marzan");
        output.println(321);
        output.close();
        }catch(Exception e){
            System.out.println("ERROR : %s\n"+e);
        }
        
        try{
        Scanner input = new Scanner(f);
        String name = input.nextLine();
        int age = input.nextInt();
        
        System.out.println("Name : " + name + "\n" +"AGE : " + age);
        
        } catch(Exception e){
            System.out.println("ERROR : %s\n"+e);
        }
        
        
        
        
        
        
    }
    
}
