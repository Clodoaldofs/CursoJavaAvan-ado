package entities;

public class Rectangle {
	public double windth;
	public double height;
	
	public Rectangle(double windth, double height) {
		this.windth=windth;
		this.height=height;
	}
	
	public Rectangle() {
	
	}
	
	public double area() {
		return windth*height;
		
	}
	public double perimeter() {
		return 2*(windth+height);
		
	}
	public double diagonal() {
		return Math.sqrt(windth*windth+height*height);
				
	}
}
