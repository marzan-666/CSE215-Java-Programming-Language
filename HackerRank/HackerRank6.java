/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class HackerRank6 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int testCases = f.nextInt();
        for(int i = 0; i < testCases; i++){
            char[] inputString = f.next().toCharArray();
			
            // Print even chars
            for(int j = 0; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.print(" ");
            
            // Print odd chars
            for(int j = 1; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.println();
        }
        f.close();
    }
}
    

