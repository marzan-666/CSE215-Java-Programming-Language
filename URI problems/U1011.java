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
public class U1011 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        double pi=3.14159;
        double R=f.nextDouble();
        double v=(4/3.0)*pi*Math.pow(R,3);
        System.out.printf("VOLUME = "+"%.3f\n",v);
    }
    
}
