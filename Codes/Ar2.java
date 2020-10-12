


import java.util.Scanner;

public class Ar2 {
    public static void main(String[] args) {
        /*double [] myList = new double [10];
        Scanner input = new Scanner (System.in);
        System.out.println("enter values: ");
        for (int i=0;i<myList.length;i++){
        myList[i]=input.nextDouble();
            //System.out.println(myList[i]);
            for(i=0;i<myList.length;i++){
            myList[i]=Math.random()*100;
            System.out.println(myList[i]);
        }
        
        }*/
        int  [] a = new int [3];
        int sum = 0 ;
        for(int i=0;i<a.length;i++){
            a[i]=(int) (Math.random()*50);
            sum=sum+a[i];
            System.out.println(a[i]);  
        }
        //System.out.println(sum); ei porjonto sum er code 
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                System.out.println(max);
            }
        
       
           
        }
        
        
    
}
}