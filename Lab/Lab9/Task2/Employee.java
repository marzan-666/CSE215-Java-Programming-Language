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
public class Employee extends Person{
    String dept;
    String desg;
    
    public Employee(){
        
    }
    public Employee(String name,int age,String address,String dept,String desg){
        super(name,age,address);
        this.dept=dept;
        this.desg=desg;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public void setDesg(String desg){
        this.desg=desg;
    }
    public String getDept(){
        return dept;
    }
    public String getDesg(){
        return desg;
    }
    
}
