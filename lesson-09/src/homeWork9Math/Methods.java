package homeWork9Math;

public class Methods {
	private double a;
	private double b;
	public Methods(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public void add() {
		System.out.println("Addition :  " +this.a+" + "+this.b+" = "+(this.a+this.b));
		}
	public void sub() {
		System.out.println("Substraction :  " +this.a+" - "+this.b+" = "+(this.a-this.b));
		}
	public void mult() {
		System.out.println("Multiplication  : " +this.a+" * "+this.b+" = "+(this.a*this.b));
		}
	public void div() {
		System.out.println("Division   " +this.a+" / "+this.b+" = "+(this.a/this.b));
		}
}
