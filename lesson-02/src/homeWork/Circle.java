package homeWork;

public class Circle {
	private double radius;
	private double diametr;
	Circle(){
		this.diametr=2.2;
		this.radius=diametr/2;
	}
	Circle(double diametr){
		this.diametr=diametr;
		this.radius=diametr/2;
	}
	public double getDiametr() {
		return diametr;
	}
	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}
	
	public double circleArea() {
		double circleArea=this.diametr*this.diametr/4*Math.PI;
		return circleArea;
	}
	public double circleArea(double diametr) {
		double circleArea=diametr*diametr/4*Math.PI;
		return circleArea;
	}
	public double circleLenght() {
		double circleLenght=2*Math.PI*this.radius;;
		return circleLenght;
	}
	public double circleLenght(double radius) {
		double circleLenght=2*Math.PI*radius;
		return circleLenght;
	}
	
}
