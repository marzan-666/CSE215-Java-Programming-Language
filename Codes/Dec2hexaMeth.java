package ass1;
import java.util.Scanner ;
public class Dec2hexaMeth {
    public static void main(String args[])
    {
      Scanner input = new Scanner( System.in );
      System.out.print("Enter a decimal number : ");
      int num =input.nextInt();
        
      // calling method toHexString()
      String str = Integer.toHexString(num);
      System.out.println("Decimal to hexadecimal: "+str);
    }
    
}
