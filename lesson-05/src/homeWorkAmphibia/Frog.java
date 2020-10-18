package homeWorkAmphibia;

public class Frog extends Amphibia{

	@Override
	void eat() {
		System.out.println("I can eat");		
	}

	@Override
	void sleep() {
		System.out.println("I can sleep");
	}

	@Override
	void swim() {
		System.out.println("I can swim");
	}

	@Override
	void walk() {
		System.out.println("I can jump");		
	}	
	
}
