package HomeWork23;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class FractionOfDeputats_13 {

	Deputy_13 deputy = new Deputy_13();
	Scanner scanner = new Scanner(System.in);

	public void setDeputy() {
		System.out.println("����� ��� ��������");
		deputy.setFirstName(scanner.nextLine());
		System.out.println("����� ������� ��������");
		deputy.setLastName(scanner.next());
		System.out.println("����� ������� ��������");
		deputy.setFraction(scanner.next());
		System.out.println("����� �� ��������");
		deputy.setAge(scanner.nextInt());
		System.out.println("����� ���� ��������");
		deputy.setWeight(scanner.nextInt());
		System.out.println("����� ��� ��������");
		deputy.setHeigth(scanner.nextInt());
		System.out.println("����� �� ������� ���� �����");
		deputy.setBribe(scanner.nextBoolean());
		if (deputy.isBribe()) {
			System.out.println("����� ������ ������� ���� ������ ");
			deputy.setQuantityOfBribe(scanner.nextInt());

		}

	}

// Case 7
	public void deleteDeputy(List<Deputy_13> deputy, String nameDeputyDelete) {

		ListIterator<Deputy_13> listIterator1 = deputy.listIterator();

		while (listIterator1.hasNext()) {
			Deputy_13 previous = listIterator1.next();
			if (previous.getLastName().toUpperCase().equals(nameDeputyDelete)) {
				listIterator1.remove();
			}
		}
	}

	// Case 8
	public void showBribe(List<Deputy_13> deputy) {
		deputy.forEach(x->{
			if (x.isBribe()) {
				System.out.println(x.getFirstName() + "  " + x.getLastName() + " ���� �����!!");
			}
		});
		
		
//		for (Deputy dep : deputy) {
//			if (dep.isBribe()) {
//				System.out.println(dep.getFirstName() + "  " + dep.getLastName() + " ���� �����!!");
//			}
//		}
	}

	// Case 9
	public void maxBribe(List<Deputy_13> deputy) {
		int maxBribe = 0;
		String nameOfMaxBribe = "";
		
		
		
		for (Deputy_13 dep : deputy) {

			if (maxBribe < dep.getQuantityOfBribe()) {
				maxBribe = dep.getQuantityOfBribe();
				nameOfMaxBribe = dep.getFirstName() + " " + dep.getLastName();
			}

		}
		System.out.println(nameOfMaxBribe + " ���� �������� �����!!");
	}

	// Case 5
	public void showAllDeputyOfFraction(List<Deputy_13> deputy, String fraction) {
		
		deputy.forEach(x->{
			String fr = x.getFraction().toUpperCase();
			if (fraction.equals(fr)) {
				System.out.println(
						"������� " + x.getFirstName() + "  " + x.getLastName() + " �������� �������  " + fraction);
			}
		});
//		for (Deputy dep : deputy) {
//			String fr = dep.getFraction().toUpperCase();
//			if (fraction.equals(fr)) {
//				System.out.println(
//						"������� " + dep.getFirstName() + "  " + dep.getLastName() + " �������� �������  " + fraction);
//			}
//		}
	}

	// Case 4
	public void deleteAllDeputyOfFraction(List<Deputy_13> deputy, String fraction) {

		ListIterator<Deputy_13> listIterator1 = deputy.listIterator();

		while (listIterator1.hasNext()) {
			Deputy_13 previous = listIterator1.next();
			if (previous.getFraction().toUpperCase().equals(fraction)) {
				listIterator1.remove();
			}
		}
	}

	// Case 3
	public void ShowAll(List<Deputy_13> deputy) {
		
		deputy.forEach(x->System.out.println("�������" + x.getFirstName() + " " + x.getLastName() + " �������� �� ������� "
					+ x.getFraction()));
		
//		for (Deputy dep1 : deputy) {
//			System.out.println("�������" + dep1.getFirstName() + " " + dep1.getLastName() + " �������� �� ������� "
//					+ dep1.getFraction());
//		}
	}
}
