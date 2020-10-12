
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        //Scanner input = new Scanner (System.in);
        //int min=1990,max=2020;
        //System.out.println("enter a year: ");
        int n=(int)(1990+Math.random()*(2020-1990+1));
        System.out.println(n);
       
        //for(int i=min;i<=max;i++){
            if((n%400==0) ||(n%4==0&& n%100!=0)){
                System.out.println("True");
               
        }
            else
                System.out.println("false");
    }
    
}

