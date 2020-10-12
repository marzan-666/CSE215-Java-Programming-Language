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
public class U1013 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int a=f.nextInt();
        int b=f.nextInt();
        int s=f.nextInt();
        int MaiorAB=((a+b+a*b*s*(a-b))/2);
        System.out.println(MaiorAB+" eh o maior");
    }
    
}
// not done . . . . . . . . . .