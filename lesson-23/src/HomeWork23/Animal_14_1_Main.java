package HomeWork23;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Animal_14_1_Main {

	public static void main(String[] args) {

		Collection<Animal_14_1> animal = new HashSet<>();
		animal.add(new Animal_14_1("���", 123));
		animal.add(new Animal_14_1("����", 5456));
		animal.add(new Animal_14_1("�����", 2123));
		animal.add(new Animal_14_1("�������", 3123));
		animal.add(new Animal_14_1("������", 223));
		animal.add(new Animal_14_1("�����", 87));

		for (Animal_14_1 animal2 : animal) {
			System.out.println(animal2);
		}
		System.out.println("\n--Sorted---\n");
		List<Animal_14_1> sorted = animal.stream().sorted(new AnimalComparator_14_1()).collect(Collectors.toList());
		for (Animal_14_1 animal2 : sorted) {
			System.out.println(animal2);
		}

	}

}
