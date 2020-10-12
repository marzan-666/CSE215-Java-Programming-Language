/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9.task2;

public class FTEmployee extends Employee{
    private double basic;
    private double allow;
    
    public FTEmployee(){
        
    }
    public FTEmployee(String name,int age,String address,String dept,String desg,double basic,double allow){
        super(name,age,address,dept,desg);
        this.basic=basic;
        this.allow=allow;
    }
    public void setBasic(){
        this.basic=basic;
    }
    public void setAllow(){
        this.allow=allow;
    }
    public double getBasic(){
        return basic;
    }
    public double getAllow(){
        return allow;
    }
    public String toString(){
        return "salary:"+salary();
    }
    public double salary(){
        return basic+(25.0/100.0)*basic;
    }
}
