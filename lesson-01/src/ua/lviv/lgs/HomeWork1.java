package ua.lviv.lgs;

import java.util.Random;

public class HomeWork1 {
public static void main(String[] args) {
	
	byte a = 1;
	short b= 2;
	int c=3;
	long d=23232;
	char e='a';
	float f=2.45F;
	double g=3.45;
	boolean h=false;
	System.out.println("byte a =" + a);
	System.out.println("short b ="+ b);
	System.out.println("int c =" + c);
	System.out.println("long d ="+ d);
	System.out.println("char e =" + e);
	System.out.println("float f ="+ f);
	System.out.println("double g =" + g);
	System.out.println("boolean h ="+ h);
	System.out.println("------------------------");
	Byte a1=a;
	Short b1=b;
	Integer c1=c;
	Long d1=d;
	Character e1=e;
	Float f1=f;
	Double g1=g;
	Boolean h1=h;
	System.out.println("Byte a =" + a1);
	System.out.println("Short b ="+ b);
	System.out.println("Integer c =" + c);
	System.out.println("Long d ="+ d);
	System.out.println("Character e =" + e);
	System.out.println("Float f ="+ f);
	System.out.println("Double g =" + g);
	System.out.println("Boolean h ="+ h);
	System.out.println("------------------------");
	System.out.println("max Byte =" + Byte.MAX_VALUE+"     min Byte ="+ Byte.MIN_VALUE);
	System.out.println("max Short ="+ Short.MAX_VALUE+"   min Short ="+ Short.MIN_VALUE);
	System.out.println("max Integer =" + Integer.MAX_VALUE+"   min Integer ="+ Integer.MIN_VALUE);
	System.out.println("max Long ="+ Long.MAX_VALUE +"   min Long ="+ Integer.MIN_VALUE);
	System.out.println("max Character =" + Character.MAX_VALUE+"   min Character ="+ Character.MIN_VALUE);
	System.out.println("max Float ="+ Float.MAX_VALUE + "   min Float"+ Float.MIN_VALUE);
	System.out.println("max Double =" + Double.MAX_VALUE+"   min Double"+ Double.MIN_VALUE);
	System.out.println("Boolean h ="+ h);
	System.out.println("------------------------");
	
	int [] array=new int[10];
	for (int i = 0; i < array.length; i++) {
		Random r = new Random();
		array[i]=r.nextInt(100);
		System.out.print(array[i]+"  ");
	}
	int arrayMax=array[0];
	int arrayMin=array[0];
	
	for (int i = 1; i < array.length; i++) {
		if (arrayMax<array[i]) {
			arrayMax=array[i];
		};
		if (arrayMin>array[i]) {
			arrayMin=array[i];
		};
	}
	System.out.println("\nArrayMax ="+arrayMax);
	System.out.println("ArrayMin ="+arrayMin);
}
}
