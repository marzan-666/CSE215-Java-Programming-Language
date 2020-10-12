package Lab2;

import java.util.Scanner;


public class task4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,i;
		
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter An Integer: ");
		
		a=x.nextInt();
		System.out.print("Divisors Are: ");
		for(i=1;i<a;i++)
		{
			if(a%i==0)
				System.out.print(i+" ");
		}

	}

}
