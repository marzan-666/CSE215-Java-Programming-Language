/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.Scanner ;
public class Task4 {
    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
    System.out.println();
    int n =input.nextInt();
    int bebo=-123,lolo=1234;
    int [] anArray = new int [n];
    
    for(int i=0; i<n ; i++){
        anArray[i]=input.nextInt();
        if(anArray[i]<3){
            bebo=bebo>anArray[i]?bebo:anArray[i];
        }
        else if(anArray[i]>3){
            lolo=lolo<anArray[i]?lolo:anArray[i];
        }
        
        
    
}
    System.out.println(bebo + " and " + lolo);
}
    
    
    
}
