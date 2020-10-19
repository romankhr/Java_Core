package com.lgs.lab.interface2;

public class MainCalculator {

	public static void main(String[] args) {
		
		MyCalculator c= new MyCalculator(10, 2);
		c.add();
		c.divide();
		c.mult();
		c.subtract();
	}

}
