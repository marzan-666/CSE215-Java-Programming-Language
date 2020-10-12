package Lab13;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahadi Hasan Sagor
 */
public class arrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] a=new int[100];
        
        for(int i=0; i<100; i++){
        
            a[i]=(int) (Math.random()*10000);
        }
        
        System.out.println("Enter array index: ");
        int n=sc.nextInt();
        
        try{
        
            if(n<0 || n>100)throw new Exception("Out of index");
            
            System.out.println(a[n]);
            
            }catch(Exception e){
                    
                    System.out.println(e.getMessage());
                    }
        
        }
    }

