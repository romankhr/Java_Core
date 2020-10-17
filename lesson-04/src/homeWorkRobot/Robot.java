package homeWorkRobot;

public class Robot {
	private int power;

	public Robot(int power) {
		this.power = power;
	}
	
	public String work() {
		return "Я Robot - я просто працюю!";
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Robot [power=" + power + "]";
	}
	
}
