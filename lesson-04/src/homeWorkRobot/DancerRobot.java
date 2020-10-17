package homeWorkRobot;

public class DancerRobot extends Robot {
	private int speed;
	public DancerRobot(int power, int speed) {
		super(power);
		this.speed=speed;
	}
	public String work() {
		return "Я RobotDancer - я просто танцюю!";
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "DancerRobot [speed=" + speed + "]";
	}

}
