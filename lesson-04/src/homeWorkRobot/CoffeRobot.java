package homeWorkRobot;

public class CoffeRobot extends Robot {
	private int volume;
	public CoffeRobot(int power, int volume) {
		super(power);
		this.volume=volume;
	}
	public String work() {
		return "Я CoffeRobot - я варю каву!";
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "CoffeRobot [volume=" + volume + "]" + super.getPower();
	}
	
	

}
