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
public class U1015 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        double x1=f.nextDouble();
        double y1=f.nextDouble();
        double x2=f.nextDouble();
        double y2=f.nextDouble();
        double d=Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        double distance=Math.sqrt(d);
        System.out.printf("%.4f\n",distance);
    }
    
}
