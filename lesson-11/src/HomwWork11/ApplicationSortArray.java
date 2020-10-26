package HomwWork11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ApplicationSortArray {

	public static void main(String[] args) {
		
		Integer [] array = new Integer[10];
		for( int i=0; i<array.length; i++) {
			array[i]=getRandomValueFromRange(0, 10);
		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		
		
		//** HELP!! Collections.reverseOrder() is not working!!!!((
		
Arrays.sort(array, Collections.reverseOrder());
System.out.println(Arrays.toString(array));

	}
	public static int getRandomValueFromRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value must be less than max value");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
