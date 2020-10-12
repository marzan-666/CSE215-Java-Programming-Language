package ass1;
import java.util.Scanner;
public class Dec2HexBeta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter decimal number: ");
        int n = input.nextInt();
        String s = "";
        String s1 = "";
        int remainder,remainder1;
        char remainderPrime;
        char remainderPrime1;
        remainder1 = n%16;
          if(remainder1>=10)
            {
                remainderPrime1= (char)(remainder1 - 10 + 'A');
                
            }
            else
            {
                remainderPrime1 = (char)(remainder1+ '0');
            }
         //System.out.println("uh:"+remainder);
        while(n/16!=0)
        {
            n = n / 16;
            remainder = n%16;
            if(remainder>=10)
            {
                remainderPrime = (char)(remainder - 10 + 'A');
             }
            else
            {
                remainderPrime = (char)(remainder + '0');
            }
           s = remainderPrime + s;
        }
        s1 = s + remainderPrime1;
        System.out.println("hexadecimal is: "+s1);     
    }
        
    }
    
