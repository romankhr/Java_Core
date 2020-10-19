package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements  Numerable {
	private int x;
	private int y;
	
	public MyCalculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void add() {
		System.out.println(getX() +"+"+getY()+"="+ (getX()+getY()));
		
	}

	@Override
	public void subtract() {
		System.out.println( getX() +"-"+getY()+"="+ (getX()-getY()));
		
	}

	@Override
	public void mult() {
		System.out.println( getX() +"*"+getY()+"="+ (getX()*getY()));
		
	}

	@Override
	public void divide() {
		System.out.println( getX() +"/"+getY()+"="+ (getX()/getY()));
		
	}

}
