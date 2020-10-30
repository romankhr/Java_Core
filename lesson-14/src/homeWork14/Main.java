package homeWork14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Animal> animal = new HashSet<>();
		animal.add(new Animal("Лев", 123));
		animal.add(new Animal("Слон", 5456));
		animal.add(new Animal("Жираф", 2123));
		animal.add(new Animal("Бегемот", 3123));
		animal.add(new Animal("Горила", 223));
		animal.add(new Animal("Шакал", 87));
		
		for (Animal animal2 : animal) {
			System.out.println(animal2);
		}
		System.out.println("---\n");
		

		TreeSet<Animal> animal1 = new TreeSet<>(new AnimalComparator());
		animal1.add(new Animal("Лев", 123));
		animal1.add(new Animal("Слон", 5456));
		animal1.add(new Animal("Жираф", 2123));
		animal1.add(new Animal("Бегемот", 3123));
		animal1.add(new Animal("Горила", 223));
		animal1.add(new Animal("Шакал", 87));
		animal1.add(new Animal("Горила", 123));
		animal1.add(new Animal("Шакал", 90));
		animal1.add(new Animal("Горила", 93));
		animal1.add(new Animal("Шакал", 88));
		
		for (Animal animal2 : animal1) {
			System.out.println(animal2);
		}
		
		
		

	}

}
