/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner ;

public class ComputeLoan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter annual interest: ");
        double annualInterestRate = input.nextDouble();
        
        double monthlyInterestRate = annualInterestRate/1200;
        
        System.out.println("Enter number of year: ");
        int numberOfYear = input.nextInt();
        int numberOfYears = 0;
        
        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();
       
        
        double monthlyPayment = loanAmount * monthlyInterestRate / (1-1/Math.pow(1+monthlyInterestRate, numberOfYears * 12));
        
        double totalPayment = monthlyPayment *numberOfYears * 12 ;
        
        System.out.println("the monthly payment is $ "+(int)(monthlyPayment*100)/100.);
        
                
        System.out.println("the total payment is $ "+(int)(totalPayment*100)/100.0);
    }
    
}
