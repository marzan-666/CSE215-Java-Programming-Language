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
public class integerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int sum=0;
        int count=0;
        System.out.println("Enter 10 positive integers: ");
        while(count<10){
        
            int n=sc.nextInt();
            try{
            
                if(n<0)throw new Exception("Input positive integer");
                sum+=n;
                count++;
                        
            }catch(Exception e){
            
                System.out.println(e.getMessage());
            }
            
        
        }
        System.out.println(sum);
    }
}
