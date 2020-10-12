package bmi;

public class BodyMassIndex {
    private String name;
    private int age;
    private double height;
    private double weight;
    
    public BodyMassIndex(String name , int age ,double height , double weight ){
        
        //this("abc" , 18 , height , weight);
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    public double getBMI(){
        return weight/(height*height);
    }
    public String getStatus(){
        double bmi=getBMI();
        
        if(bmi<22) return "UNDERWEIGHT";
        else if (bmi<26) return "NORMAL";
        else return "OVERWEIGHT";
        
                
    }
    
    
}
