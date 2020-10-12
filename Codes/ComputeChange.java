/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner ;

public class ComputeChange {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double amount = input.nextDouble();
        
        int cents = (int)(amount*100);
        
        int dollars = cents/100;
        cents=cents%100;
        
        int quarters = cents/25;
        cents = cents%25;
        
        int dimes = cents/10;
        cents = cents%10 ;
        
        int nickels = cents/5;
        cents = cents%5;
        
        System.out.println(dollars + " " +quarters+" "+dimes+" "+nickels+" "+cents);
                
    }
    
}
