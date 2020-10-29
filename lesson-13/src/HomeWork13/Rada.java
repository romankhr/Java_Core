package HomeWork13;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public final class Rada {
	Deputy deputy = new Deputy();
	Scanner scanner = new Scanner(System.in);
	
	public void setFraction() {
		System.out.println("Ведіть фракцію");
		deputy.setFraction(scanner.nextLine());
	}
	
	public void delFraction(List<Deputy> deputy) {
		System.out.println("Ведіть фракцію, яку порібно видалити");
		String ss=scanner.next().toUpperCase();
		for (Deputy dep1 : deputy) {
			if (dep1.getFraction().toUpperCase().equals(ss.toUpperCase())) {
				dep1.setFraction("Free");
			}		
		}
	}
}
