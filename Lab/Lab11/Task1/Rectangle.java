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
public abstract class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(){
        
    }
    public Rectangle(String name,double length,double width){
        super(name);
        this.length=length;
        this.width=width;
        
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
    
}
