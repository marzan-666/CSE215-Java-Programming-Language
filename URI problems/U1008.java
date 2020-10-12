/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class U1008 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int num=f.nextInt();
        int hr=f.nextInt();
        double rate=f.nextDouble();
        double salary=hr*rate;
        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ "+"%.2f\n",salary);
    }
    
}
