package HomeWork13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		List<Deputy> deputy = new ArrayList<>();
		FractionOfDeputats dep = new FractionOfDeputats();
		Rada rada = new Rada();
		Scanner scanner = new Scanner(System.in);

		deputy.add(new Deputy(87, 177, "Roman", "Avramenko", 33, false, "Victory", 0));
		deputy.add(new Deputy(76, 165, "Ivan", "Petrenko", 54, true, "Victory", 1000));
		deputy.add(new Deputy(98, 180, "Oleg", "Danko", 43, true, "Freedom", 2000));
		deputy.add(new Deputy(72, 170, "Vika", "Bandura", 48, false, "Victory", 0));
		deputy.add(new Deputy(87, 177, "Anna", "Darana", 23, false, "Freedom", 0));

		for (Deputy dep1 : deputy) {
			System.out.println(dep1);
		}

		boolean bb = true;
		while (bb) {
			System.out.println("Введіть 1, щоб додати фракцію");
			System.out.println("Введіть 2, щоб видалити фракцію");
			System.out.println("Введіть 3, щоб вивести усі фракції");
			System.out.println("Введіть 4, щоб очистити фракцію");
			System.out.println("Введіть 5, щоб показати певну фракцію");
			System.out.println("Введіть 6, щоб додати депутата у фракцію");
			System.out.println("Введіть 7, щоб видалити депутата з фракції");
			System.out.println("Введіть 8, щоб вивести список хабарників");
			System.out.println("Введіть 9, щоб показати найбільшого хабарника");
			switch (scanner.nextInt()) {
			case 1:
				rada.setFraction();
				break;
			case 2:
				rada.delFraction(deputy);
				break;
			case 3:
				dep.ShowAll(deputy);
				break;
			case 4:
				System.out.println("Введіть фракцію, яку потрібно видалити");
				dep.deleteAllDeputyOfFraction(deputy, scanner.next().toUpperCase());
				break;
			case 5:
				System.out.println("Введіть фракцію, яку потрібно показати");
				dep.showAllDeputyOfFraction(deputy, scanner.next().toUpperCase());
				break;
			case 6:
				dep.setDeputy();

				deputy.add(new Deputy(dep.deputy.getWeight(), dep.deputy.getHeigth(), dep.deputy.getFirstName(),
						dep.deputy.getLastName(), dep.deputy.getAge(), dep.deputy.isBribe(), dep.deputy.getFraction(),
						dep.deputy.getQuantityOfBribe()));

				break;
			case 7:
				System.out.println("Введіть прізвище депутата, якого потрібно видалити");
				dep.deleteDeputy(deputy, scanner.next().toUpperCase());
				break;
			case 8:
				dep.showBribe(deputy);
				break;
			case 9:
				dep.maxBribe(deputy);
				break;
			default:
				bb = false;
				break;
			}
			System.out.println("\n--------Список зі змінами-------\n");
			for (Deputy dep1 : deputy) {
				System.out.println(dep1);
			}
			System.out.println("\n---------------\n");

		}
	}

}
