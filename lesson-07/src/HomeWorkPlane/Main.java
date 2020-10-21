package HomeWorkPlane;

public class Main {

	public static void main(String[] args) {
		Cy27  plane1= new Cy27("Red", 1500, 36, 27, 46);
		plane1.startEngine();
		plane1.landing();
		plane1.takeOff();
		System.out.println("");
		System.out.println(plane1.toString());
		System.out.println("");
		plane1.goLeft();
		plane1.goRight();
		plane1.goUp();
		plane1.goDown();
		System.out.println("----------------");
		plane1.Stels();
		plane1.Bomb();
		plane1.Turbo();
		System.out.println("----------------");
	}

}
