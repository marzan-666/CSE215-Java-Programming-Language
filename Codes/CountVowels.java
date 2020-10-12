/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class CountVowels {
    public static void main(String[] args) {
        String s = "apple" ;
        int n=s.length();
        int count = 0 ;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
