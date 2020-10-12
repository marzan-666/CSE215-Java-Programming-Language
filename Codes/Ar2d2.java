/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class Ar2d2 {
    public static void main(String[] args) {
        int [][] array= {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println();
    }
    
}
