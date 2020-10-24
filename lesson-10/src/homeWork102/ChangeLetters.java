package homeWork102;

import java.util.Scanner;

public class ChangeLetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a sentence ");
		String str = new String();
		str = scanner.nextLine();
		char chars[] = str.toCharArray();
		String word[] = str.split(" ");
		int i = 0;

		for (i = 0; i < str.length(); i++) {
			if (chars[i] == 'a' || chars[i] == 'o' || chars[i] == 'y' || chars[i] == 'u' || chars[i] == 'e'
					|| chars[i] == 'o' || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'Y' || chars[i] == 'U'
					|| chars[i] == 'O' || chars[i] == 'i' || chars[i] == 'I') {
				chars[i] = '-';
			}
		}
		System.out.println("\nModified sentence\n");
		System.out.println(chars);
		int counter = 0;
		for (String s : str.split(" ")) {
			if (s.length() > 1) {
				counter++;
			}
		}
		System.out.println("\nThe quantity of the words in the sentenses are " + counter);
		System.out.println("-------------------------");

		int wordCases[] = new int[word.length];
		for (int j = 0; j < word.length - 1; j++) {
			for (int r = j + 1; r < word.length; r++) {
				if (word[j].equals(word[r])) {

					wordCases[j]++;

				}
			}
		}
		int max = 0;
		int num = -1;
		for (int j = 0; j < word.length - 1; j++) {

			if (max < wordCases[j]) {
				max = wordCases[j];
				num = j;
			}
		}
		if (num >= 0) {
			System.out.println("The word " + word[num] + " the most used in the sentence");
		} else {
			System.out.println("The all word is used once");
		}

	}
}
