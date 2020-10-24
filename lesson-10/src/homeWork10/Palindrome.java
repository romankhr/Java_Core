package homeWork10;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a word that has 5 letters ");
		StringBuffer str=new StringBuffer();
		try {
			str.append(scanner.next().toLowerCase());

			if(str.length()!=5) {
				throw new MyException("error");
			}
			else {
			if (str.equals(str.reverse())) {
				System.out.println("The word " + str + " is a palindrome!!!!");
			};
			}
		
		} catch ( MyException e) {
			
		}
		
	}

}
