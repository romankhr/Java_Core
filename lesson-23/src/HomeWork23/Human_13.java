package HomeWork23;

public class Human_13 {
	private int weight;
	private int heigth;
	public Human_13() {};
	public Human_13(int weight, int heigth) {
		super();
		this.weight = weight;
		this.heigth = heigth;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	@Override
	public String toString() {
		return "Human [weight=" + weight + ", heigth=" + heigth + "]";
	}
	
}
