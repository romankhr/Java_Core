package HomeWorkPlane;

public class Cy27 extends Plane implements TurboStels  {
	MoveRand move=new MoveRand();
	private ManagePlane manage;
	private String color="Black";
	private int speed;
	public void goLeft() {
		this.manage = new ManagePlane();
		manage.goLeft();	
	}
	public void goRight() {
		this.manage = new ManagePlane();
		manage.goRight();	
	}
	public void goUp() {
		this.manage = new ManagePlane();
		manage.goUp();	
	}
	public void goDown() {
		this.manage = new ManagePlane();
		manage.goDown();	
	}
	public Cy27(String color, int speed, int lendht, int widht, int weidht) {
		super(lendht, widht, weidht);
		this.color=color;
		this.speed=speed;
	}
	@Override
	void startEngine() {
		int secondsToStart=(int) (Math.random()*(88-20)+20);
		System.out.println("Engine is starting. He will take OFF in " +secondsToStart  + " seconds!");
		
	}

	@Override
	void takeOff() {
		System.out.println("Plaine is taking OFF. He will fly for " + move.move()*10 + " kilometers" );
		
	}

	@Override
	void landing() {
		System.out.println("Plaine is landing");
		
	}


	@Override
	public String toString() {
		return "Cy27 [ color = " + color + ", speed = " + speed + ", Lenght="
				+ getLendht() + ", Widht = " + getWidht() + ", Weidht = " + getWeidht() + "]";
	}
	@Override
	public void Stels() {
		System.out.println("The plane is invisible for " + move.move() + " seconds");
		
	}
	@Override
	public void Turbo() {
		int speedAdd=move.move();
		int speedNew=speedAdd+speed;
		System.out.println("The plane is in TURBO mode for " + speedAdd + " seconds. His speed is " + speedNew+ ". Previous speed was "+ speed);
		
	}
	@Override
	public void Bomb() {
		System.out.println("The plane has   " + move.move()/10 + " bombs");
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
