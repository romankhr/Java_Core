package homeWork;

public class Square {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(22,3);
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		r3.setHeight(10);
		r3.setWidth(20);
		System.out.println("�������� ������������ = " +r1.perimeter());
		System.out.println("����� ������������ = " +r1.area());
		System.out.println("�������� ������������ = " +r2.perimeter());
		System.out.println("����� ������������ = " +r2.area());
		System.out.println("�������� ������������ = " +r3.perimeter());
		System.out.println("����� ������������ = " +r3.area());
		System.out.println("Width  r3= " +r3.getWidth());
		System.out.println("Heidht r3 = " +r3.getHeight());
		
		
		Circle c1=new Circle();			//diameter
		Circle c2=new Circle(22.2);
		Circle c3=new Circle(11.6);
		c3.setDiametr(6.6);
		System.out.println("������� ���� = " +c1.circleLenght());
		System.out.println("����� ���� = " +c1.circleArea());
		System.out.println("������� ���� = " +c2.circleLenght());
		System.out.println("����� ���� = " +c2.circleArea());
		System.out.println("������� ���� = " +c3.circleLenght());
		System.out.println("����� ���� = " +c3.circleArea());
		System.out.println("ĳ�����  c1= " +c1.getDiametr());
		System.out.println("ĳ�����  c2= " +c2.getDiametr());
		System.out.println("ĳ�����  c3= " +c3.getDiametr());
	}

}

