package homeWorkRobot;

public class Application {

	public static void main(String[] args) {
		
		Robot r1 = new Robot(1000);
		System.out.println(r1.work() +" My power is " + r1.getPower());
		r1.setPower(2230);
		System.out.println(r1.work() +" My power is " + r1.getPower());
		
		CoffeRobot c1 = new CoffeRobot(900, 2);
		System.out.println(c1.work() +" My power is " + c1.getPower()+" My volume is " + c1.getVolume());
	
		DancerRobot d1 = new DancerRobot(3200, 21);
		System.out.println(d1);
		System.out.println(d1.work() + " My power is " + d1.getPower()+" My speed is " + d1.getSpeed());
	
		CoockerRobot coock1 = new CoockerRobot(1000, 98);
		System.out.println(coock1);
		System.out.println(coock1.work() + " My power is " + coock1.getPower()+" My temperature is " + coock1.getTemperature());
	
	Robot [] array = new Robot [4];
	System.out.println("\n-------------------\n");
	array[0]=c1;
	array[1]=d1;
	array[2]=r1;
	array[3]=coock1;
	 for (int i = 0; i<4; i++){
         System.out.println(array[i].work());
     }
	}

}
