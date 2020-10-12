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
public class HackerRank5 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter a number want to display: ");
        int n=f.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
        
    }
    
}
