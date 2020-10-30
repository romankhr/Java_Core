package homeWork14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Animal> animal = new HashSet<>();
		animal.add(new Animal("���", 123));
		animal.add(new Animal("����", 5456));
		animal.add(new Animal("�����", 2123));
		animal.add(new Animal("�������", 3123));
		animal.add(new Animal("������", 223));
		animal.add(new Animal("�����", 87));
		
		for (Animal animal2 : animal) {
			System.out.println(animal2);
		}
		System.out.println("---\n");
		

		TreeSet<Animal> animal1 = new TreeSet<>(new AnimalComparator());
		animal1.add(new Animal("���", 123));
		animal1.add(new Animal("����", 5456));
		animal1.add(new Animal("�����", 2123));
		animal1.add(new Animal("�������", 3123));
		animal1.add(new Animal("������", 223));
		animal1.add(new Animal("�����", 87));
		animal1.add(new Animal("������", 123));
		animal1.add(new Animal("�����", 90));
		animal1.add(new Animal("������", 93));
		animal1.add(new Animal("�����", 88));
		
		for (Animal animal2 : animal1) {
			System.out.println(animal2);
		}
		
		
		

	}

}
