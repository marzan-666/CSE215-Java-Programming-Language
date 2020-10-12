/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass1;
import java.util.Scanner ;
public class MinhWords {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int m= input.nextInt();
         int n = 0;
         int n1 = 0;
         int remainder1;
         int remainder = 0;
         if(m==0)
             System.out.println("zero");
         else{
         
          n = m / 1000;
         remainder = m%1000;
 
 
          if(n==1)
        {
            System.out.print("One");
        }
        else if(n==2)
        {
            System.out.print("Two");
        }
         else if(n==3)
         {
             System.out.print("Three");
         }
         else if(n==4)
         {
             System.out.print("Four");
         }
         else if(n==5)
         {
             System.out.print("Five");
         }
         else if(n==6)
         {
             System.out.print("Six");
         }
         else if(n==7)
         {
             System.out.print("Seven");
         }
         else if(n==8)
         {
             System.out.print("Eight");
         }
         else if(n==9)
         {
             System.out.print("Nine");
         }
          if(n>0)
          {
                 System.out.print(" Thousands ");
          }
           n = remainder / 100;
           remainder = remainder % 100;       
 
         if(n==1)
        {
            System.out.print("One");
        }
        else if(n==2)
        {
            System.out.print("Two");
        }
         else if(n==3)
         {
             System.out.print("Three");
         }
         else if(n==4)
         {
             System.out.print("Four");
         }
         else if(n==5)
         {
             System.out.print("Five");
         }
         else if(n==6)
         {
             System.out.print("Six");
         }
         else if(n==7)
         {
             System.out.print("Seven");
         }
         else if(n==8)
         {
             System.out.print("Eight");
         }
         else if(n==9)
         {
             System.out.print("Nine");
         }
         if(n>0)
         {
        System.out.print(" Hundred ");
         }
          n = remainder / 10;
         remainder = remainder % 10;
 
         if(n==2)
        {
            System.out.print("Twenty");
        }
         else if(n==3)
         {
             System.out.print("Thirty");
         }
         else if(n==4)
         {
             System.out.print("Forty");
         }
         else if(n==5)
         {
             System.out.print("Fifty");
         }
         else if(n==6)
         {
             System.out.print("Sixty");
         }
         else if(n==7)
         {
             System.out.print("Seventy");
         }
         else if(n==8)
         {
             System.out.print("Eighty");
         }
         else if(n==9)
         {
             System.out.print("Ninety");
         }
             System.out.println(" ");
            if(remainder==1)
        {
            System.out.print("One");
        }
        else if(remainder==2)
        {
            System.out.print("Two");
        }
         else if(remainder==3)
         {
             System.out.print("Three");
         }
         else if(remainder==4)
         {
             System.out.print("Four");
         }
         else if(remainder==5)
         {
             System.out.print("Five");
         }
         else if(remainder==6)
         {
             System.out.print("Six");
         }
         else if(remainder==7)
         {
             System.out.print("Seven");
         }
         else if(remainder==8)
         {
             System.out.print("Eight");
         }
         else if(remainder==9)
         {
             System.out.print("Nine");
         }
            if(n==1)
            {
                if(remainder ==0)
                {
                    System.out.print("Ten");
                }
                else if(remainder == 1)
                {
                    System.out.println("Eleven");
                }
                 else if(remainder == 2)
                {
                    System.out.println("Twelve");
                }
                 else if(remainder == 3)
                {
                    System.out.println("Thirteen");
                }
                 else if(remainder == 4)
                {
                    System.out.println("Fourteen");
                }
                 else if(remainder == 5)
                {
                    System.out.println("Fifteen");
                }
                 else if(remainder == 6)
                {
                    System.out.println("Sixteen");
                }
                 else if(remainder == 7)
                {
                    System.out.println("Seventeen");
                }
                 else if(remainder == 8)
                {
                    System.out.println("Eighteen");
                }
                 else if(remainder == 9)
                {
                    System.out.println("Nineteen");
                }
 
            }
 
 
 
    }
         System.out.println("");
 
    }
    }
