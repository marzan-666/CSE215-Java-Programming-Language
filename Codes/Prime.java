/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Prime {
    boolean isPrime(int n){
        if(n==1)return false;
        int m=(int)Math.sqrt(n);
        int i=2;
        while(i<=m){
            if(n%i==0) return false ;
            i++;
    }
        return false;
    
}
    public static void main(String[] args) {
        System.out.println();
    }
}
