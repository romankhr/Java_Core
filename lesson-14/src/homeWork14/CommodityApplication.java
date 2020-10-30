package homeWork14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CommodityApplication {
	public static void main(String[] args) {

		List<Commodity> goods = new ArrayList<>();
		Commodity good = new Commodity();
		Scanner scanner = new Scanner(System.in);
		goods.add(new Commodity("�����", 25, 12, 3));
		goods.add(new Commodity("����", 55, 20, 23));
		goods.add(new Commodity("�����", 225, 22, 33));
		goods.add(new Commodity("�������", 45, 42, 4));
		goods.add(new Commodity("³���", 225, 112, 45));
		goods.add(new Commodity("����", 225, 90, 31));

		for (Commodity commod2 : goods) {
			System.out.println(commod2);
		}
		System.out.println("-------------------------------");
		while (true) {
			System.out.println("������ 1 ��� ������ ����� �����");
			System.out.println("������ 2 ��� �������� �����");
			System.out.println("������ 3 ��� ������� �����");
			System.out.println("������ 4 ��� ��������� ����� �� ������");
			System.out.println("������ 5 ��� ��������� ����� �� ��������");
			System.out.println("������ 6 ��� ��������� ����� �� �������");
			System.out.println("������ 7 ��� ��������� ����� �� �����");
			System.out.println("������ 8 ��� ��������  ����� � ������ �������");
			System.out.println("������ 9 ��� ����� � ����");
			System.out.println("-------------------------------");
			
			switch (scanner.nextInt()) {
			case 1:
				good.addGoods();
				goods.add(new Commodity(good.getName(), good.getLendht(), good.getWidth(), good.getWeight()));
				for (Commodity commod2 : goods) {
					System.out.println(commod2);
				}
				break;
			case 2:
				good.deleteGood(goods);
				for (Commodity commod2 : goods) {
					System.out.println(commod2);
				}
				break;

			case 3:
				if(good.change(goods)) {
					goods.add(new Commodity(good.getName(), good.getLendht(), good.getWidth(), good.getWeight()));
				};
				for (Commodity commod2 : goods) {
					System.out.println(commod2);
				}
				break;

			case 4:
				Collections.sort(goods, new CommodityNameComparator());
				for (Commodity commod2 : goods) {
					System.out.println(commod2);
				}
				break;

			case 5:
				Collections.sort(goods, new CommodityLenghtComparator());
				for (Commodity commod2 : goods) {
					System.out.println(commod2);
				}
				break;

			case 6:
				Collections.sort(goods, new CommodityWidthComparator());
				for (Commodity commod2 : goods) {
					System.out.println(commod2);
				}
				break;

			case 7:
				Collections.sort(goods, new CommodityWeigthComparator());
				for (Commodity commod2 : goods) {
					System.out.println(commod2);
				}
				break;

			case 8:
				good.showGoods(goods);
				break;

			default:
				System.exit(0);
				break;
			}

		}

	}
}
