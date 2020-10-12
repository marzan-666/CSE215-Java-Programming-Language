package Lab8;


public class Rectangle extends Shape {
	private double side1;
	private double side2;

	public Rectangle(String name,double side1,double side2) {
		super(name);
		this.side1=side1;
		this.side2=side2;
		
	}
	public double getArea(){
		return side1*side2;
	}
	public double getPerimeter(){
		return 2*(side1+side2);
	}
	


}
