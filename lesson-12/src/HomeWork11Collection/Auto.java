package HomeWork11Collection;

public class Auto {
	private int power;
	private int yearOfProduction;
	private Helm helm;
	private Engine engine;
	
	public Auto(int power, int yearOfProduction, int helmDiametr,String helmMaterial, int numberOfCylinders) {
		this.power = power;
		this.yearOfProduction = yearOfProduction;
		this.helm = new Helm();
		this.engine = new Engine();
		helm.setHelmDiametr(helmDiametr);
		helm.setHelmMaterial(helmMaterial);
		engine.setNumberOfCylinders(numberOfCylinders);
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	@Override
	public String toString() {
		return "Auto [power=" + power + ", yearOfProduction=" + yearOfProduction + ", helmDiametr=" + helm.getHelmDiametr() + " HelmMaterial="+ helm.getHelmMaterial() +", enginenumberOfCylinders="
				+ engine.getNumberOfCylinders() + "]";
	}
	
	
	
}
