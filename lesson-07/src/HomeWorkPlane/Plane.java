package HomeWorkPlane;

public abstract class Plane{
	private int lendht;
	private int widht;
	private int weidht;
	abstract void startEngine();
	abstract void takeOff();
	abstract void landing();
	public Plane(int lendht, int widht, int weidht) {
		super();
		this.lendht = lendht;
		this.widht = widht;
		this.weidht = weidht;
	}
	public int getLendht() {
		return lendht;
	}
	public void setLendht(int lendht) {
		this.lendht = lendht;
	}
	public int getWidht() {
		return widht;
	}
	public void setWidht(int widht) {
		this.widht = widht;
	}
	public int getWeidht() {
		return weidht;
	}
	public void setWeidht(int weidht) {
		this.weidht = weidht;
	}
	
}
