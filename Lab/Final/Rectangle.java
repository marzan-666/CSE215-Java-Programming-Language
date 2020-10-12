package LabFinal;


public class Rectangle extends Shape implements IComparable{
    private double length;
    private double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
        try{
            if(length<=0||width<=0) throw new IllegalShapeException("Length or Width may be less or equal zero");
            else{
                this.length=length;
                this.width=width;
            }
        }catch(IllegalShapeException ex){
            System.out.println(ex.displayErrorMessage());
        }
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        try{
            if(length<=0) throw new IllegalShapeException("Length may be less or equal zero");
            else{
                this.length=length;
            }
        }catch(IllegalShapeException ex){
            System.out.println(ex.displayErrorMessage());
        }
    }
    public void setWidth(double width){
        try{
            if(width<=0) throw new IllegalShapeException("Width may be less or equal zero");
            else{
                this.width=width;
            }
        }catch(IllegalShapeException ex){
            System.out.println(ex.displayErrorMessage());
        }
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }
    @Override
    public int compareShape(Object ob){
        double ra=this.getLength();
        double ra1=this.getWidth();
        Rectangle r1=new Rectangle(ra,ra1);
        if(r1.equals(ob)==true){
            Rectangle r2=(Rectangle)ob;
            if(r1.getLength()>r2.getLength()){
                return 1;
            }
            else if(r1.getLength()==r2.getLength()){
                return 0;
            }
            else 
                return -1;
        }
        else if(r1.equals(ob)==false){
            Circle c=(Circle)ob;
            if(r1.getLength()>c.getRadius())
                return 1;
            else if(r1.getLength()==c.getRadius())
                return 0;
            else
                return -1;
        }
        return 123;
    }
}
