package homeWork14;

public class Goods {
	private String name;
	private int lendht;
	private int width;
	private int weight;
	public Goods(String name, int lendht, int width, int weight) {
		super();
		this.name = name;
		this.lendht = lendht;
		this.width = width;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLendht() {
		return lendht;
	}
	public void setLendht(int lendht) {
		this.lendht = lendht;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", lendht=" + lendht + ", width=" + width + ", weight=" + weight + "]";
	}
	
}
