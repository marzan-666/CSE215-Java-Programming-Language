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
public class Employee extends Person{
    private String id;
    String dept;
    double salary;
    
    public Employee(){
        
    }
    public Employee(String name,String gender,int age,String id,String dept,double salary){
        super(name,gender,age);
        this.id=id;
        this.dept=dept;
        this.salary=salary;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getId(){
        return id;
    }
    public String getDept(){
        return dept;
    }
    public double getSalary(){
        return salary;
    }
    public String toString(){
        return "ID: "+id+"DEPARTMENT: "+dept+"SALARY: "+salary;
    }
    
}
