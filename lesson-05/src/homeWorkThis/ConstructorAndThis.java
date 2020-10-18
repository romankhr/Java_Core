package homeWorkThis;

public class ConstructorAndThis {
	private int a;
	private int b;
	private int c;
	
	public ConstructorAndThis(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor with a and b");
	}
	public ConstructorAndThis(int a, int b, int c) {
		this(a,b);
		this.c=c;
		System.out.println("Constructor with c that calls other constructor"+"a =" +a+" b = "+b+" c = "+ c);
	}
}
