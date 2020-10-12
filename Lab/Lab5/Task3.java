package Lab5;

import java.util.Scanner;


public class Task3 {
	static double balance ;
	public static void main(String [] args){
		Scanner f = new Scanner (System.in);
		loop1:
		while(true){
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Balance");
			System.out.println("4.Exit");
			System.out.println("5.Enter your option : ");
			int i = f.nextInt();
			switch(i){
			case 1:{
				System.out.println("Enter amount to deposit: ");
				double amount = f.nextDouble();
				deposit(amount);
				break;
			}
			case 2:{
				System.out.println("Enter amount to withdraw: ");
				double amount = f.nextDouble();
				withdraw(amount);
				break;
			}
			case 3:{
				System.out.println("Your current balance is: "+balance);
				break;
				
			}
			case 4:{
				System.out.println("EXITTING PROGRAM");
				break loop1; 
			}
			default:{
				System.out.println("Invalid input ");
				break ;
			}
			}
		}
	}
	static void deposit(double amount){
		balance = balance + amount;
	}
	static void withdraw(double amount){
		if((balance-amount)>=0){
			balance = balance-amount;
		}
		else{
			System.out.println("balance nai ");
		}
	}

}
