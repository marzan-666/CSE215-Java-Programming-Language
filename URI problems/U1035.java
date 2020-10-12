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
public class U1035 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int A=f.nextInt();
        int B=f.nextInt();
        int C=f.nextInt();
        int D=f.nextInt();
        if(B>C && D>A && C+D>A+B && C>0 && D>0 && A%2==0){
            System.out.println("Valores aceitos");
        }
        else System.out.println("Valores nao aceitos");
    }
    
}
