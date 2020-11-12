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
		animal.add(new Animal_14_1("Лев", 123));
		animal.add(new Animal_14_1("Слон", 5456));
		animal.add(new Animal_14_1("Жираф", 2123));
		animal.add(new Animal_14_1("Бегемот", 3123));
		animal.add(new Animal_14_1("Горила", 223));
		animal.add(new Animal_14_1("Шакал", 87));

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
