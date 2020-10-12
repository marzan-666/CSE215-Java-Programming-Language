/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass1;
import java.util.Scanner;
public class InwordsFinal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,digit1,digit2,digit3,digit4;
        
        String str1[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        String str2[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen"};
        String str3[]={"hundred"};
        String str4[]={"thousand"};
System.out.println("enter any number : ");
num=input.nextInt();
        if((num<1)||(num>=10000)){
            System.out.println("wrong input");
        }   
        else if((num>=1)&&(num<=19)){
            System.out.println(str2[num]);
        }
        else if((num>=20)&&(num<=99)){
            digit1 = num/10;
            digit2 = num%10;
            
            
            System.out.println( str1[digit1] + " " + str2[digit2]);
        } 
               else if((num>=100)&&(num<=999)){
            digit1=num/100;
            digit3=num%100;
            
            System.out.println(str2[digit1] + " " + str3[digit3]);
        }
               else if((num>=1000)&&(num<=9999)){
                   digit1=num/1000;
                   digit4=num%1000;
                   System.out.println(str2[digit1] + " " + str4[digit4]);
               }
}
}