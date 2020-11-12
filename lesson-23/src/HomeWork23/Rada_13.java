package HomeWork23;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public final class Rada_13 {
	Deputy_13 deputy = new Deputy_13();
	Scanner scanner = new Scanner(System.in);
	
	public void setFraction() {
		System.out.println("Ведіть фракцію");
		deputy.setFraction(scanner.nextLine());
	}
	
	public void delFraction(List<Deputy_13> deputy) {
		System.out.println("Ведіть фракцію, яку порібно видалити");
		String ss=scanner.next().toUpperCase();
		deputy.forEach(x->{
			if (x.getFraction().toUpperCase().equals(ss.toUpperCase())) {
				x.setFraction("Free");
			}		
		});
		
		
//		for (Deputy dep1 : deputy) {
//			if (dep1.getFraction().toUpperCase().equals(ss.toUpperCase())) {
//				dep1.setFraction("Free");
//			}		
//		}
	}
}
