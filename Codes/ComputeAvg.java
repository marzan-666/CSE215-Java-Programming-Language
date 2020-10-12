/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner ;

public class ComputeAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        double num1 = input.nextDouble() ;
        double num2 = input.nextDouble() ;
        double num3 = input.nextDouble() ;
        
        double avg = (num1+num2+num3)/3 ;
        
        System.out.println("The average is : "+ avg);
    }
    
}
