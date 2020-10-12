/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        int [] array=new int[6];
        int sum=0,count=0;double avg,per;
        Scanner s=new Scanner(System.in);
        System.out.println("enter numbers below:\n");
        for(int i=0;i<6;i++){
            array[i]=s.nextInt();
            sum=sum+array[i];
           
            
            
        }
        System.out.println("sum is :" + sum);
        avg = sum/6.0;
        System.out.println("average is:" + avg);
        for(int i=0;i<6;i++){
            if(array[i]>avg)
                count++ ;
        }
            
        per=(count/6.0)*100;
        System.out.println("percentage is:" + per + "%");
        
    
    }
}


 
    
    
    

