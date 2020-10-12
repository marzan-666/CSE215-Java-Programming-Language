/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
public class Task3 {
    public static void main(String[] args) {
        int sum=0;
        int[][] y={{3,4,9},{2,9,11},{4,6,0}};
        for(int i=0;i<3;i++){
        sum=0;
        for(int j=0;j<3;j++){
            sum=sum+y[i][j];
        }
        System.out.println("sum of row "+ (i+1) + " is : " + sum);
        
        
    }
        for(int i=0;i<3;i++){
            sum=0;
            for(int j=0;j<3;j++){
                sum=sum+y[j][i];
            }
            System.out.println("sum of column "+ (i+1)+" is : " + sum);
    }
        sum=0;
        sum=y[0][0]+y[1][1]+y[2][2];
        System.out.println("Sum of 1st diagonal is : "+sum );
        sum=0;
        sum=y[0][2]+y[1][1]+y[2][0];
        System.out.println("sum of 2nd diagonal is : "+sum);
}
}