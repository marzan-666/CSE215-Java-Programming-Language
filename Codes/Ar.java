

import java.util.Scanner;

public class Ar {
    public static void main(String[] args) {
        double [] a = new double [ 3];
        //a = new double [3];
        a[0]=23;a[1]=27;a[2]=25;
        int c [] ={3,5,7,9,1};
        int sum = 0; 
        int [] d = c;
        //int i = 0;
        int b [] = new int [4];
        for(int i=0;i<b.length;i++){
            //System.out.println(d[i]);
            //Scanner input = new Scanner (System.in);
            //b[i]=input.nextInt();
            b[i]=(int) (1+Math.random()*(50-1+1));
            sum = sum+b[i];
            System.out.println(b[i]);
            //System.out.println(sum);
             int m = 0 ;
            for( i=1;i<b.length;i++){
            if(b[i]>b[m]){
            }
            System.out.println(b[m]);
            
        }
       
        }
    }
}
        
    
    

