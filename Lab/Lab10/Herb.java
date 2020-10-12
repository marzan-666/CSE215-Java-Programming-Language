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
public class Herb extends Plant{
    private boolean isMedicinal;
    private String season;
    public Herb(){
        
    }
    public Herb(String name,String color,boolean isMedicinal,String season){
        super(name,color);
        this.isMedicinal=isMedicinal;
        this.season=season;
    }
    public boolean getIsMedicinal(){
        return isMedicinal;
    }
    public String getSeason(){
     return season; 
    }
    public void setIsMedicinal(boolean isMedicinal){
        this.isMedicinal=isMedicinal;
    }
    public void setSeason(String season){
        this.season=season;
    }
    @Override
    public String toString(){
        return super.toString()+"\nmedicinal:"+isMedicinal+"\nseason:"+season;
    }
}
