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
public class Flower extends Plant{
    private boolean hasSmell;
    private boolean hasThorn;
    
    public Flower(){
        
    }
    public Flower(String name,String color,boolean hasSmell,boolean hasThorn){
        super(name,color);
        this.hasSmell=hasSmell;
        this.hasThorn=hasThorn;
    }
    public boolean getHasSmell(){
        return hasSmell;
    }
    public boolean getHasThorn(){
        return hasThorn;
    }
    public void setHasSmell(boolean hasSmell){
        this.hasSmell=hasSmell;
    }
    public void setHasThorn(boolean hasThorn){
        this.hasThorn=hasThorn;
    }
    @Override
    public String toString(){
        return super.toString()+"\nSmell:"+hasSmell+"\nThorn:"+hasThorn;
    }
    
}
