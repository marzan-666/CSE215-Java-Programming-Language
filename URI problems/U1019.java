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
public class U1019 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int N=f.nextInt();
        int min=N/60;
        int hr=min/60;
        int sec=N%60;
        System.out.println(hr+":"+(min%60)+":"+sec);
    }
    
}
