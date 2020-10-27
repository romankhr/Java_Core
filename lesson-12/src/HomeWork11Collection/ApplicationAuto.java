package HomeWork11Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ApplicationAuto {

	public static void main(String[] args) {
		int n1 = getRandomValueFromRange(5, 10);

		ArrayList array = new ArrayList();
		String material;
		System.out.println("\n--------------------Filled arr the RANDOM auto data--------\n");
		for (int i = 0; i < n1; i++) {

			if (getRandomValueFromRange(0, 1) == 1) {
				material = "skin";
			} else {
				material = "alcantara";
			}

			array.add(new Auto(getRandomValueFromRange(50, 200), getRandomValueFromRange(1990, 2020),
					getRandomValueFromRange(20, 30), material, getRandomValueFromRange(2, 8)));
		}

		System.out.println(array);
		array.clear();
		for (int i = 0; i < n1; i++) {
			array.add(new Auto(100, 200, 22, "skin", 4));
		}
		System.out.println("\n--------------------Filled arr the same auto data--------\n");
		System.out.println(array);

	}

	public static int getRandomValueFromRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value must be less than max value");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
