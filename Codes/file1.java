/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer2k17;

import java.io.File;

/**
 *
 * @author user
 */
public class file1 {

    
    public static void main(String[] args) {
        
         File f = new File("F:\\Test\\file1.txt");
         
         if(f.exists()){
             System.out.println(f.getName()+ " exists");
         }else{
             System.out.println("that thing does not exists");
         }
        
    }
   
    
    
}
