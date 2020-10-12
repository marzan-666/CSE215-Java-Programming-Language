/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double mealCost = input.nextDouble();
        int tipPercent = input.nextInt();
        int taxPercent = input.nextInt();
        
        double tip = mealCost*tipPercent/100;
        double tax = mealCost*taxPercent/100;
        
        int totalCost = (int)Math.round(mealCost+tip+tax) ;
        System.out.println(totalCost);
        
    }
    
}
