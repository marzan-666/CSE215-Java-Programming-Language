/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArIn {
    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            /*int [] a = new int [3];
            int i = 0;
            a[i]=input.nextInt();
            for(i=0;i<a.length;i++){
                System.out.println(a[i]);
            }*/
            int [] a = new int[5];
            System.out.println("Enter "+a.length+" values: ");
            for(int i=0;i<a.length;i++){
                a[i]=input.nextInt();
                
            }
        
    }
    
}
