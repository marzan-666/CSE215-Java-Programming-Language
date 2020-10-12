/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11.Task1;

/**
 *
 * @author user
 */
public abstract class Shape {
    private String name;
    
    public Shape(){
        
    }
    public Shape(String name){
        this.name=name;
        
    }
    public String getName(){
        return name;
        
    }
    public void setName(String name){
        this.name=name;
    }
    public abstract double area();
    public abstract double perimeter();
    
}
