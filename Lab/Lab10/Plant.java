package Lab10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Plant {
    private String name;
    private String color;
    public Plant(){
        
    }
    public Plant(String name,String color){
        this.name=name;
        this.color=color;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setColor(String name){
        this.color=color;
    }
    @Override
    public String toString(){
        return "Name:"+name+"\nColor:"+color;
    }
}
