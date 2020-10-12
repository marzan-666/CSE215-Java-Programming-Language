/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
import java.util.Scanner;
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int x=1;
         do{
        try {
       
        System.out.println("enter first number: ");
        int n1=input.nextInt();
        System.out.println("enter second number: ");
        int n2=input.nextInt();
        int result=n1/n2;
        System.out.println("result is: " + result);
        x=2;
        }
        catch (ArithmeticException e) {
            System.out.println("u can't do that\n");
        }
         }
        while(x==1);
        //System.out.println("Program ended");
}
}
