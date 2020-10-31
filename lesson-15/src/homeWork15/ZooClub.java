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
			System.out.println("\n������ 1 ��� ������ �������� �����");
			System.out.println("������ 2 ��� ������ ������� �� �������� �����");
			System.out.println("������ 3 ��� �������� ������� � �������� �����");
			System.out.println("������ 4 ��� �������� �������� �����");
			System.out.println("������ 5 ��� �������� ������� � ��� �������� �����");
			System.out.println("������ 6 ��� ������� �������");
			System.out.println("������ 7 ��� ����� �� ��������\n");

			switch (scanner.nextInt()) {
			case 1: {
				System.out.println("����� ��� ������ �������� �����");
				String nameNewPerson = scanner.next();
				System.out.println("����� �� ������ �������� �����");
				int ageNewPerson = scanner.nextInt();
				map.put(new Person(nameNewPerson, ageNewPerson), new ArrayList<>());
				break;
			}
			case 2: {
				System.out.println("����� ��� �������� �����, � ����� �������� ���� ��������");
				String namePerson = scanner.next();
				Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
				while (iterator.hasNext()) {
					Entry<Person, List<Animal>> next = iterator.next();
					if (next.getKey().getNameOfPerson().equals(namePerson)) {
						List<Animal> value = next.getValue();
						System.out.println("������ ��� �������� �'������� � " + namePerson);
						String typeOfAnimal = scanner.next();
						System.out.println("������ ��� ��� � ��������, �� �'������� � " + namePerson);
						String nameOfAnimal = scanner.next();
						value.add(new Animal(typeOfAnimal, nameOfAnimal));
						next.setValue(value);
					}
				}
				break;
			}
			case 3: {
				System.out.println("����� ��� �������� �����, � ����� ������� �������� ��������");
				String namePerson = scanner.next();
				Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
				while (iterator.hasNext()) {
					Entry<Person, List<Animal>> next = iterator.next();
					if (next.getKey().getNameOfPerson().equals(namePerson)) {
						List<Animal> value = next.getValue();
						System.out.println("������ ��� �������� �������� � �������� ����� " + namePerson);
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
				System.out.println("����� ��� �������� �����, ����� ������� ��������");
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
				System.out.println("����� ��������, ��� ������� �������� � ��� �������� ��������");
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
