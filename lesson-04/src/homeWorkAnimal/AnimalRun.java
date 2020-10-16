package homeWorkAnimal;

public class AnimalRun {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Леопард", 7, 20);
		Animal a2 = new Animal("Бик", 14, 2);
		Animal a3 = new Animal("Кінь", 10, 25);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		a1.setName("Тигр");
		a1.setAge(5);
		a1.setVelocity(30);
		
		a2.setName("Заяць");
		a2.setAge(7);
		a2.setVelocity(10);
		
		a3.setName("Вовк");
		a3.setAge(8);
		a3.setVelocity(22);
		System.out.println("\n----------\n");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println("\n----------\n");
		System.out.println("Назва тварини = " + a1.getName()+" Вік тварини = "+a1.getAge()+" Швидкість тварини= "+a1.getVelocity());
		System.out.println("Назва тварини = " + a2.getName()+" Вік тварини = "+a2.getAge()+" Швидкість тварини= "+a2.getVelocity());
		System.out.println("Назва тварини = " + a3.getName()+" Вік тварини = "+a3.getAge()+" Швидкість тварини= "+a3.getVelocity());
		
		
		

	}

}
