package Lab2;

import java.util.Scanner ;

public class Divisor {
    public static void main(String[] args) {
        
        int i,a;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer : ");
        
        a=input.nextInt() ;
        
        System.out.println("Divisors are : ");
        
        for(i=1;i<a;i++){
            if(a%i==0)
                System.out.print(i+" ");
        }
    }
    
}
