package homeWork9Math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
public static void main(String[] args) throws IllegalAccessException {
	Methods m=new Methods(3,5);
	m.add();
	m.setA(12);
	m.add();
	Scanner scanner = new Scanner(System.in);
//	System.out.println("Input doudble a=");
//	m.setA(scanner.nextDouble());
//	System.out.println("Input doudble b=");
//	m.setB(scanner.nextDouble());
	double a;
	double b;
	
	try {
		System.out.println("Input doudble a=");
		if (scanner.hasNextDouble()) {
			a=scanner.nextDouble();
			m.setA(a);
		}
		else {
			System.out.println("The input A is not an integer");
				throw new InputMismatchException("String can not be empty!");
		}
		System.out.println("Input doudble b=");
		if (scanner.hasNextDouble()) {
			b=scanner.nextDouble();
			m.setB(b);
		}
		else {
			System.out.println("The input B is not an integer");
				throw new InputMismatchException("String can not be empty!");
		}
		
		if(a<0 && b<0) {
			throw new IllegalArgumentException();
		}
		if(a==0 && b!=0 || a!=0 && b==0) {
			throw new ArithmeticException();
		}
		if(a==0 && b==0) {
			throw new IllegalAccessException();
		}
		if(a==0 && b!=0 || a!=0 && b==0) {
			throw new MyException("d");
		}
	} catch (InputMismatchException e) {
		System.err.println("The input number is not an integer");
	}
	catch(IllegalArgumentException e) {
		System.err.println("The input numbers should be positive");
	}
	catch(ArithmeticException e) {
		System.err.println("The input numbers should be more than 0");
	}
	catch(MyException e) {
		System.err.println("The input numbers should non be more than  0");
	}
	
	m.add();
	m.sub();
	m.mult();
	m.div();
}
}
