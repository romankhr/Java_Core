package HomwWork11;

public class Engine {
	private int numberOfCylinders;

	

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	@Override
	public String toString() {
		return "Engine [numberOfCylinders=" + numberOfCylinders + "]";
	}
	
}
