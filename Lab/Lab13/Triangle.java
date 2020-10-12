package Lab13;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahadi Hasan Sagor
 */
public class Triangle {
    
        private double a;
        private double b;
        private double c;
        
        public Triangle(double a, double b, double c){
            
            try{
            
                if((a+b)>c && (b+c)>a && (c+a)>b){
                
                    this.a=a;
                    this.b=b;
                    this.c=c;
                
                }
                else{
                
                    throw new IllegalTriangleException("Error when creeating triagle");
                }
            }catch(IllegalTriangleException e){
            
            
                System.out.println(e.massage());
            }
        
        }
        
        
        
    
}
