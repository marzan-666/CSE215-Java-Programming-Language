
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int n = f.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            
        }
    }
    
}
