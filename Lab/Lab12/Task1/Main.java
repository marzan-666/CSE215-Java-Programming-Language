/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12.Task1;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Polygon p=new Triangle(3,3,4,5) {};
        
        System.out.println(p.area() +"\n"+ p.perimeter());
        
    }
    
}
