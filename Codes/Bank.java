
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner f = new Scanner (System.in);
        while(true){
            System.out.println("1. deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your option : ");
            int i = f.nextInt();
            
            switch(i){
                case 1:{
                    System.out.println("Enter amount to Deposit: ");
                    double amount=f.nextDouble();
                    break;
                    
                }
            }
        }
}
}