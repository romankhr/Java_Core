package HomeWork23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CommodityApplication_14_2_Main {
	public static void main(String[] args) {

		List<Commodity_14_2> goods = new ArrayList<>();
		Commodity_14_2 good = new Commodity_14_2();
		Scanner scanner = new Scanner(System.in);
		goods.add(new Commodity_14_2("�����", 25, 12, 3));
		goods.add(new Commodity_14_2("����", 55, 20, 23));
		goods.add(new Commodity_14_2("�����", 225, 22, 33));
		goods.add(new Commodity_14_2("�������", 45, 42, 4));
		goods.add(new Commodity_14_2("³���", 225, 112, 45));
		goods.add(new Commodity_14_2("����", 225, 90, 31));

		for (Commodity_14_2 commod2 : goods) {
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
				goods.add(new Commodity_14_2(good.getName(), good.getLendht(), good.getWidth(), good.getWeight()));
				goods.forEach(x->System.out.println(x));
				break;
			case 2:
				good.deleteGood(goods);
				goods.forEach(x->System.out.println(x));
				break;

			case 3:
				if(good.change(goods)) {
					goods.add(new Commodity_14_2(good.getName(), good.getLendht(), good.getWidth(), good.getWeight()));
				};
				goods.forEach(x->System.out.println(x));
				break;

			case 4:
				Collections.sort(goods, new CommodityNameComparator_14_2());
				goods.forEach(x->System.out.println(x));
				break;

			case 5:
				Collections.sort(goods, new CommodityLenghtComparator_14_2());
				goods.forEach(x->System.out.println(x));
				break;

			case 6:
				Collections.sort(goods, new CommodityWidthComparator_14_2());
				goods.forEach(x->System.out.println(x));
				break;

			case 7:
				Collections.sort(goods, new CommodityWeigthComparator_14_2());
				goods.forEach(x->System.out.println(x));
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
