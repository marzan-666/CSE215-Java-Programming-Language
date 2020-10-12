
package Lab9.task1;
public class Person {
    private String name;
    private String gender;
    private int age;
    
    public Person(){
        
    }
    public Person(String name,String gender,int age){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setAddress(String address){
        this.gender=gender;      
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "NAME:"+name+"GENDER:"+gender+"AGE:"+age;
    }
}

