package homeWork14;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Commodity {
	private String name;
	private int lendht;
	private int width;
	private int weight;
	Scanner scanner = new Scanner(System.in);

	public Commodity(String name, int lendht, int width, int weight) {
		super();
		this.name = name;
		this.lendht = lendht;
		this.width = width;
		this.weight = weight;
	}

	public Commodity() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLendht() {
		return lendht;
	}

	public void setLendht(int lendht) {
		this.lendht = lendht;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", lendht=" + lendht + ", width=" + width + ", weight=" + weight + "]";
	}

	// case 1
	public void addGoods() {
		System.out.println("������ ����� ������, ���� ������");
		this.name = scanner.next();
		System.out.println("������ ������� ������, ���� ������");
		this.lendht = scanner.nextInt();
		System.out.println("������ ������ ������, ���� ������");
		this.width = scanner.nextInt();
		System.out.println("������ ���� ������, ���� ������");
		this.weight = scanner.nextInt();
	}

	// case 2
	public void deleteGood(List<Commodity> goods) {
		System.out.println("������ ����� ������, ���� ������� ��������");
		String name = scanner.next().toUpperCase();

		ListIterator<Commodity> listIterator1 = goods.listIterator();

		while (listIterator1.hasNext()) {
			Commodity previous = listIterator1.next();
			if (previous.getName().toUpperCase().equals(name)) {
				listIterator1.remove();
			}
		}

	}

	// case 3
	public boolean change(List<Commodity> goods) {
		System.out.println("������ ����� ������, ���� ������� �������");
		String name = scanner.next().toUpperCase();
		ListIterator<Commodity> listIterator1 = goods.listIterator();
		boolean flag = false;
		while (listIterator1.hasNext()) {
			Commodity previous = listIterator1.next();
			if (previous.getName().toUpperCase().equals(name)) {
				listIterator1.remove();
				addGoods();
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("������ ������ � ��� ����. ���� ������ ������, ��������� 1\n");
		}
		return flag;
	}

	// case 8
	public void showGoods(List<Commodity> goods) {
		System.out.println("������ ������� ������, ���� ������� ��������");
		int number = scanner.nextInt();

		ListIterator<Commodity> listIterator1 = goods.listIterator();

		while (listIterator1.hasNext()) {
			Commodity previous = listIterator1.next();
			if (previous.getLendht() == number) {
				System.out.println(previous);
			}
		}

	}

}
