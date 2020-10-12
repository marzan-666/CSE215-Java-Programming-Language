/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9.task2;

/**
 *
 * @author Administrator
 */
public class PTEmployee extends Employee{
    private double hours;
    private double rate;
    public PTEmployee(){
        
    }
    public PTEmployee(String name,int age,String address,String dept,String desg,double hours,double rate){
        super(name,age,address,dept,desg);
        this.hours=hours;
        this.rate=rate;
    }
    public void setHours(double hours){
        this.hours=hours;
    }
    public void setRate(double rate){
        this.rate=rate;
    }
    public double getHours(){
        return hours;
    }
    public double getRate(){
        return rate;
    }
    public String toString(){
        return "salary"+salary();
    }
    public double salary(){
        return hours*rate;
    }
}
