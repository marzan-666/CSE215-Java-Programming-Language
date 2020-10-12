package summer2k17;

import java.util.Scanner;

public class Hackerrank2 {
    public static void main(String[] args) {
        int i=4;
        double d=4.0;
        String s="HackerRank ";
        Scanner ins =new Scanner(System.in);
        int num=ins.nextInt();
        int sum=num+i;
        Scanner dos=new Scanner(System.in);
        double numb=dos.nextDouble();
        double value=numb+d;
        Scanner str=new Scanner(System.in);
        String p=str.nextLine();
        String s2=s+p;
        System.out.println(sum);
        System.out.println(value);
        System.out.println(s2);
        
    }
    
    
}

// APPROVED 1 IS GIVEN BELOW. . .
/*

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
      
        int j=scan.nextInt();
        
        
        double e=scan.nextDouble();
        
        scan.nextLine();
        String t=scan.nextLine();

        System.out.println(j+i);
        System.out.println(e+d);
        System.out.println(s+t);
        scan.close();
}
}
*/