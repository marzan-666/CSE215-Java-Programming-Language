package LabFinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mojammel
 */
public abstract class Shape {
    private String color;
    public Shape(){}
    public Shape(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
