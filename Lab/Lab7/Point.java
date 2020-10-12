
public class Point {
	private int x;
	private int y;
	
	Point(){
		
	}
    Point(int x1 , int y1){
    	this.x=x1;
    	this.y=y1;
    	
    }
    public int getX(){
    	return x;
    }
    public int getY(){
    	return y;
    }
    public void setX(int x1){
    	this.x=x1;
    }
    public void setY(int y1){
    	this.y=y1;
    }
    public String toString(){
    	return "("+x+","+y+")" ;
    	
    }
    public double distance(Point point){
    	double value = Math.pow(x-point.x, 2)+Math.pow(y-point.y, 2);
    	double value1=Math.sqrt(value);
    	return value1;
    	
    }

}
