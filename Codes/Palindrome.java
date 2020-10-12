/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class Palindrome {
    public static void main(String[] args) {
        String s = "goat";
        if(isPalindrome(s)){
            System.out.println(s+" : is a palindrome");
        }
        else{
            System.out.println(s+" : is not a palindrome");
        }
        
    }
        static boolean isPalindrome(String s) {
        //String s = "Madam";
        String s1=s.toLowerCase();
        int n = s.length();
        for(int i=0;i<(n/2);i++){
            if(s1.charAt(i)!= s1.charAt(n-1-i)){
                return false ;
            }
            }
        return true;
        }
    }
    

    
