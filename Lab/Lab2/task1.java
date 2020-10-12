package Lab2;

import java.util.Scanner;


public class task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter An Integer: ");
		
		a=x.nextInt();
		
		int b=a%2;
		
		switch(b)
		{
		
		case 0:
			System.out.println("Even");
			break;
			
		default:
			System.out.println("Odd");
			break;
		}
		
	}

}
