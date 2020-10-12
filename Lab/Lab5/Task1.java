/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author user
 */
    

public class Task1 {
	public static void main(String[]args){
		String s = "welcome to java programming";
		//int vowels =  countVowels(s);
		System.out.println("Number of vowels int the string is "+countVowels(s));
		
	}
	static int countVowels(String s){
		int n=s.length();
		
		int count = 0 ;
		for (int i=0;i<n;i++){
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				count++ ;
			}
		}
		return count ;
		
	}

}

