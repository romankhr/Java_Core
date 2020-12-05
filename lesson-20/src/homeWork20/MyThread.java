package homeWork20;

import java.util.Scanner;

public class MyThread extends Thread {

	Scanner scanner = new Scanner(System.in);

	@Override
	public void run() {

		System.out.print("       Input number =  ");

		int number = scanner.nextInt();
		int[] fib = new int[number + 2];
		fib[0] = 0;
		fib[1] = 1;

		System.out.print("      Потік Thread :    ");
		for (int i = 2; i <= number + 1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
			System.out.print(fib[i - 1] + "  ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n");
	}
}
