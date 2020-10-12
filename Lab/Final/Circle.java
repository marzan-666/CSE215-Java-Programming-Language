package LabFinal;


public class Circle extends Shape implements IComparable{
    private double radius;
    public Circle(double radius){
        //super(color);
        try{
            if(radius<=0) throw new IllegalShapeException("Radius is less then zero equal zero");
            else this.radius=radius;
        }catch(IllegalShapeException ex){
            System.out.println(ex.displayErrorMessage());
        }
        
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        try{
            if(radius<=0) throw new IllegalShapeException("Radius is less then zero equal zero");
            else this.radius=radius;
        }catch(IllegalShapeException ex){
            System.out.println(ex.displayErrorMessage());
        }
    }
    @Override
    public double getArea(){
        return 3.14159*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return 2*3.14159*radius;
    }
    @Override
    public int compareShape(Object ob){
        double c=this.getRadius();
        Circle c1=new Circle(c);
        if(c1.equals(ob)==true){
            Circle c2=(Circle)ob;
            if(c1.getRadius()>c2.getRadius()){
                return 1;
            }
            else if(c1.getRadius()==c2.getRadius())
                return 0;
            else 
                return -1;
        }
        else if(c1.equals(ob)==false){
            Rectangle r1=(Rectangle)ob;
            if(c1.getRadius()>r1.getLength()){
                return 1;
            }
            else if(c1.getRadius()==r1.getLength()){
                return 0;
            }
            else
                return -1;
        }
        return 12;
    }
}
