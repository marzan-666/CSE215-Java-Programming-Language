/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4 ;
import java.util.Scanner ;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
    int n=input.nextInt();
    int [] anArray = new int [n];
    
    System.out.println("the fibonacci series is :");
    
    for(int i=0;i<n;i++){
        if(i==0)
            anArray[i]=0;
        else if(i==1)
            anArray[i]=1;
        else if(i==2)
          anArray[i]=2;
        else
            anArray[i]=anArray[i-1]+anArray[i-2];
        System.out.println(anArray[i]);
     }
    
                                                                                                                           
    }
}

