package homeWorkAnimal;

public class AnimalRun {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("�������", 7, 20);
		Animal a2 = new Animal("���", 14, 2);
		Animal a3 = new Animal("ʳ��", 10, 25);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		a1.setName("����");
		a1.setAge(5);
		a1.setVelocity(30);
		
		a2.setName("�����");
		a2.setAge(7);
		a2.setVelocity(10);
		
		a3.setName("����");
		a3.setAge(8);
		a3.setVelocity(22);
		System.out.println("\n----------\n");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println("\n----------\n");
		System.out.println("����� ������� = " + a1.getName()+" ³� ������� = "+a1.getAge()+" �������� �������= "+a1.getVelocity());
		System.out.println("����� ������� = " + a2.getName()+" ³� ������� = "+a2.getAge()+" �������� �������= "+a2.getVelocity());
		System.out.println("����� ������� = " + a3.getName()+" ³� ������� = "+a3.getAge()+" �������� �������= "+a3.getVelocity());
		
		
		

	}

}
