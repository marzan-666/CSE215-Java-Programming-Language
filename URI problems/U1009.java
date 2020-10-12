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
public class U1009 {
    public static void main(String[] args) {
        Scanner f = new Scanner (System.in);
        String name = f.next();
        double salary = f.nextDouble();
        double sale=f.nextDouble();
        double total=salary+(sale*15/100.00);
        System.out.printf("TOTAL = R$ "+"%.2f\n",total);
    }
    
}
