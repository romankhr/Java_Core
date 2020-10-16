package homeWork;

public class Square {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(22,3);
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		r3.setHeight(10);
		r3.setWidth(20);
		System.out.println("Периметр прямокутника = " +r1.perimeter());
		System.out.println("Площа прямокутника = " +r1.area());
		System.out.println("Периметр прямокутника = " +r2.perimeter());
		System.out.println("Площа прямокутника = " +r2.area());
		System.out.println("Периметр прямокутника = " +r3.perimeter());
		System.out.println("Площа прямокутника = " +r3.area());
		System.out.println("Width  r3= " +r3.getWidth());
		System.out.println("Heidht r3 = " +r3.getHeight());
		
		
		Circle c1=new Circle();			//diameter
		Circle c2=new Circle(22.2);
		Circle c3=new Circle(11.6);
		c3.setDiametr(6.6);
		System.out.println("Довжина кола = " +c1.circleLenght());
		System.out.println("Площа кола = " +c1.circleArea());
		System.out.println("Довжина кола = " +c2.circleLenght());
		System.out.println("Площа кола = " +c2.circleArea());
		System.out.println("Довжина кола = " +c3.circleLenght());
		System.out.println("Площа кола = " +c3.circleArea());
		System.out.println("Діаметр  c1= " +c1.getDiametr());
		System.out.println("Діаметр  c2= " +c2.getDiametr());
		System.out.println("Діаметр  c3= " +c3.getDiametr());
	}

}

