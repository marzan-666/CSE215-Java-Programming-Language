package Lab5;


public class Task2 {
	public static void main (String [] args){
		String s = "Madam" ;
		if(isPalindrome(s)){
			System.out.println(s+" : the String is a palindrome");
		}
		else{
			System.out.println(s+" : the String is not  a palindrome");
		}
		
	}
	static boolean isPalindrome(String s){
		String s1 = s.toLowerCase(); // lower case kore nilam coz input er 1st m capital
		int n = s.length();
		
		for(int i=0;i<(n/2);i++){
			if(s1.charAt(i)!=s1.charAt(n-1-i)){
				return false ;
			}
		}
		return true ;
	}
	

}
