package homeWork15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ZooClub {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map<Person, List<Animal>> map = new TreeMap<>();

		map.put(new Person("Anryy", 43), new ArrayList<>());
		map.put(new Person("Roman", 33), new ArrayList<>());
		map.put(new Person("Vova", 13), new ArrayList<>());
		map.put(new Person("Sofa", 49), new ArrayList<>());
		map.put(new Person("Nina", 36), new ArrayList<>());
		map.put(new Person("Aless", 18), new ArrayList<>());

		while (true) {
			System.out.println("\nВведіть 1 щоб додати учасника клубу");
			System.out.println("Введіть 2 щоб додати тварину до учасника клубу");
			System.out.println("Введіть 3 щоб видалити тварину в учасника клубу");
			System.out.println("Введіть 4 щоб видалити учасника клубу");
			System.out.println("Введіть 5 щоб видалити тварину у всіх учасників клубу");
			System.out.println("Введіть 6 щоб вивести ЗооКлуб");
			System.out.println("Введіть 7 щоб вийти із ЗооКлубу\n");

			switch (scanner.nextInt()) {
			case 1: {
				System.out.println("Ведіть імя нового учасника клубу");
				String nameNewPerson = scanner.next();
				System.out.println("Ведіть вік нового учасника клубу");
				int ageNewPerson = scanner.nextInt();
				map.put(new Person(nameNewPerson, ageNewPerson), new ArrayList<>());
				break;
			}
			case 2: {
				System.out.println("Ведіть імя учасника клубу, в якого зявилася нова тваринка");
				String namePerson = scanner.next();
				Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
				while (iterator.hasNext()) {
					Entry<Person, List<Animal>> next = iterator.next();
					if (next.getKey().getNameOfPerson().equals(namePerson)) {
						List<Animal> value = next.getValue();
						System.out.println("Введіть яка тваринка з'явилася в " + namePerson);
						String typeOfAnimal = scanner.next();
						System.out.println("Введіть яке імя в тваринки, що з'явилася в " + namePerson);
						String nameOfAnimal = scanner.next();
						value.add(new Animal(typeOfAnimal, nameOfAnimal));
						next.setValue(value);
					}
				}
				break;
			}
			case 3: {
				System.out.println("Ведіть імя учасника клубу, в якого потрібно видалити тваринку");
				String namePerson = scanner.next();
				Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
				while (iterator.hasNext()) {
					Entry<Person, List<Animal>> next = iterator.next();
					if (next.getKey().getNameOfPerson().equals(namePerson)) {
						List<Animal> value = next.getValue();
						System.out.println("Введіть яку тваринку видалити в учасника клубу " + namePerson);
						String typeOfAnimal = scanner.next();
						ListIterator<Animal> listIterator = value.listIterator();
						while (listIterator.hasNext()) {
							if (listIterator.next().getTypeOfAnimal().equalsIgnoreCase(typeOfAnimal)) {
								listIterator.remove();
							}
						}
					}
				}
				break;
			}
			case 4: {
				System.out.println("Ведіть імя учасника клубу, якого потрібно видалити");
				String namePerson = scanner.next();
				Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
				while (iterator.hasNext()) {
					Entry<Person, List<Animal>> next = iterator.next();
					if (next.getKey().getNameOfPerson().equalsIgnoreCase(namePerson)) {
						iterator.remove();
					}
				}
				break;
			}
			case 5: {
				System.out.println("Ведіть тваринку, яку потрібно видалити у всіх учасників зооклубу");
				String typeOfAnimal = scanner.next();
				Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
				while (iterator.hasNext()) {
					Entry<Person, List<Animal>> next = iterator.next();
					List<Animal> value = next.getValue();
					ListIterator<Animal> listIterator = value.listIterator();
					while (listIterator.hasNext()) {
						if (listIterator.next().getTypeOfAnimal().equalsIgnoreCase(typeOfAnimal)) {
							listIterator.remove();
						}
					}
				}
				break;
			}
			case 6: {
				Set<Entry<Person, List<Animal>>> entrySet = map.entrySet();
				for (Entry<Person, List<Animal>> entry : entrySet) {
					System.out.println(entry);
				}
				break;
			}
			default:
				System.exit(0);

			}

		}

	}
}
