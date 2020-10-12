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
public abstract class Polygon {
    
    private int numSide;
    
    public Polygon(){
        
    }
    public Polygon(int numSide){
        this.numSide=numSide;
        
    }
    public int getNumSide(){
        return numSide;
    }
    public void setNumSide(int numSide){
        this.numSide=numSide;
        
    }
    public abstract double area();
    public abstract double perimeter();
    
}
