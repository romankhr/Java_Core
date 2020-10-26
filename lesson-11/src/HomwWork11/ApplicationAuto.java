package HomwWork11;

import java.util.Arrays;
import java.util.Random;

public class ApplicationAuto {

	public static void main(String[] args) {
		int n1=getRandomValueFromRange(5, 10);
		int n2=getRandomValueFromRange(5, 10);
		Auto [] [] arr = new Auto[n1][n2];
		String material;
		System.out.println("\n--------------------Filled arr the RANDOM auto data--------\n");
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if (getRandomValueFromRange(0, 1)==1) {
					material="skin";
				}else {
					material="alcantara";
				}
								
				arr[i][j]=new Auto(getRandomValueFromRange(50, 200), getRandomValueFromRange(1990, 2020), getRandomValueFromRange(20, 30), 
						material, getRandomValueFromRange(2, 8));
			}
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println("\n--------------------Filled arr the same auto data--------\n");
		// to set the same car data for all array
		Auto auto = new Auto(100,200,22,"skin",4);
		for(int i=0;i<n1;i++) {
		Arrays.fill(arr[i], auto);
		};
		System.out.println(Arrays.deepToString(arr));
		
		

	}

	
	
	public static int getRandomValueFromRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value must be less than max value");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
