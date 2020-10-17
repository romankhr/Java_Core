package homeWorkRobot;

public class CoockerRobot extends Robot {
	private int temperature;
	public CoockerRobot(int power, int temperature) {
		super(power);
		this.temperature=temperature;
	}
	public String work() {
		return "Я RobotCoocker - я просто готую!";
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "CoockerRobot [temperature=" + temperature + ",  Power =" + getPower() + "]";
	}

	
	
	
}
