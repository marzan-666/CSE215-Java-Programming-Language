/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class Ar2d {
    public static void main(String[] args) {
        int [] [] matrix = new int [5][5];
        matrix[0][0] = 3;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=(int) (Math.random()*1000);
                System.out.println(matrix[i][j]);
            }
        }
        
    }
    
}
