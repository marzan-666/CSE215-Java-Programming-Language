/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass1;
import java.util.Scanner;
public class Dec2hexFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
     System.out.print("Enter a decimal number : ");
     int num =input.nextInt();
     int rem;
     String str=""; 
     char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(num>0)
     {
       rem=num%16; 
       str=hexa[rem]+str; 
       num=num/16;
     }
     System.out.println("Decimal to hexadecimal: "+str);
  }
}
    

       
