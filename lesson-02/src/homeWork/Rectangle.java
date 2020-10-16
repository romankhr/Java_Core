package homeWork;

public class Rectangle {
	private double width;
	private double height;
	
	Rectangle (){
		this.width=1.3;
		this.height=.5;
	}
	
	Rectangle (double width, double height){
		this.width=width;
		this.height=height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double perimeter(double width, double height) {
		double perimeter=(width+height)*2;
		return perimeter;
	}
	public double perimeter() {
		double perimeter=(this.width+this.height)*2;
		return perimeter;
	}
	public double area(double width, double height) {
		double area=width*height;
		return area;
	}
	public double area() {
		double area=this.width*this.height;
		return area;
	}
}
