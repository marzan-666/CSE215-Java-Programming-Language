package Lab2;

import java.util.Scanner;


public class task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter An Integer: ");
		
		a=x.nextInt();
		
		if(a%2==0 || a%3==0 || a%5==0)
		{
			System.out.println("Not Prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}
	}

}
