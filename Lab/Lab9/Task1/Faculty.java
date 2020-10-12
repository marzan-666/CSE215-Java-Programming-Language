/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9.Task1;

/**
 *
 * @author user
 */
public class Faculty extends Employee{
    private String initial;
    private String rank;
    
    public Faculty(){
        
    }
    public Faculty(String name,String gender,int age,String id,String dept,double salary,String initial,String rank){
        super(name,gender,age,id,dept,salary);
        this.initial=initial;
        this.rank=rank;      
    }
    public void setInitial(String initial){
        this.initial=initial;
    }
    public void setRank(String rank){
        this.rank=rank;
    }
    public String getInitial(){
        return initial;
    }
    public String getRank(){
        return rank;
    }
    public String toString(){
        return super.toString()+"\n INITIAL: "+initial+"\n RANK: "+rank; 
    }
}
