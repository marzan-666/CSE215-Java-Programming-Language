/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guess {
    public static void main(String[] args) {
        int number = (int) (+Math.random()*(11));
        Scanner f = new Scanner(System.in);
        System.out.println("gues magic number 0 to 10 : ");
        System.out.println(number);
        
        while(true){
            System.out.println("Enter your guess : ");
            int guess = f.nextInt();
            if(guess==number){
                System.out.println("Yes, the number is : "+number);
                break;
            }
            else if (guess>number){
                System.out.println("your guess i too high ");
            }
            else
                System.out.println("yout guess is too low ");
            
        }
        
        
        
    }
    
}
