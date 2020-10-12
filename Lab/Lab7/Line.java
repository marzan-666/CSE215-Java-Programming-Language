
public class Line {
	private Point start;
	private Point end;
	
	Line(){
		
	}
	Line(Point start , Point end){
		this.start=start;
		this.end=end;
	}
	Line(int x1 , int y1 , int x2 , int y2){
		start= new Point(x1,y1);
		end=new Point(x2,y2);
	}
	public Point getStart(){
		return start;
	}
	public Point getEnd(){
		return end;
	}
	public void setStart(){
		this.start=start;
		
	}
	public void setEnd(){
		this.end=end;
	}
	public double length(){
		return start.distance(end);
	}
	

}
