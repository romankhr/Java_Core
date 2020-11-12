package HomeWork23;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Commodity_14_2 {
	private String name;
	private int lendht;
	private int width;
	private int weight;
	Scanner scanner = new Scanner(System.in);

	public Commodity_14_2(String name, int lendht, int width, int weight) {
		super();
		this.name = name;
		this.lendht = lendht;
		this.width = width;
		this.weight = weight;
	}

	public Commodity_14_2() {

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
		System.out.println("¬вед≥ть назву товару, €кий додаЇте");
		this.name = scanner.next();
		System.out.println("¬вед≥ть довжину товару, €кий додаЇте");
		this.lendht = scanner.nextInt();
		System.out.println("¬вед≥ть ширину товару, €кий додаЇте");
		this.width = scanner.nextInt();
		System.out.println("¬вед≥ть вагу товару, €кий додаЇте");
		this.weight = scanner.nextInt();
	}

	// case 2
	public void deleteGood(List<Commodity_14_2> goods) {
		System.out.println("¬вед≥ть назву товару, €кий потр≥бно видалити");
		String name = scanner.next().toUpperCase();
		
		ListIterator<Commodity_14_2> listIterator1 = goods.listIterator();

		while (listIterator1.hasNext()) {
			Commodity_14_2 previous = listIterator1.next();
			if (previous.getName().toUpperCase().equals(name)) {
				listIterator1.remove();
			}
		}

	}

	// case 3
	public boolean change(List<Commodity_14_2> goods) {
		System.out.println("¬вед≥ть назву товару, €кий потр≥бно зам≥нити");
		String name = scanner.next().toUpperCase();
		ListIterator<Commodity_14_2> listIterator1 = goods.listIterator();
		boolean flag = false;
		while (listIterator1.hasNext()) {
			Commodity_14_2 previous = listIterator1.next();
			if (previous.getName().toUpperCase().equals(name)) {
				listIterator1.remove();
				addGoods();
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("“акого товару в баз≥ немаЇ. якщо хочете додати, натисн≥ть 1\n");
		}
		return flag;
	}

	// case 8
	public void showGoods(List<Commodity_14_2> goods) {
		System.out.println("¬вед≥ть довжину товару, €кий потр≥бно показати");
		int number = scanner.nextInt();

		goods.forEach(x->{
			if(x.getLendht()==number) {
				System.out.println(x);
			};
		});
		
		

	}

}
