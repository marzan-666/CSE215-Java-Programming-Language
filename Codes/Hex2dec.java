package ass1;

import java.util.Scanner;

public class Hex2dec {
     public static int hex2decimal(String s) {
             String input = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++) {
                 char c = s.charAt(i);
                 int d = input.indexOf(c);
                 val = 16*val + d;
             }
             return val;
         }
     public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter a hexadecimal: ");
        String input = f.nextLine();
        System.out.println(hex2decimal(input));
    }
    
} // Assignment for fall'2017 
