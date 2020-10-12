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
public class U1017 {
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        int hr=f.nextInt();
        int avgSpeed=f.nextInt();
        int distance=hr*avgSpeed;
        double ans=distance/12.0;
        System.out.printf("%.3f\n",ans);
    }
}
