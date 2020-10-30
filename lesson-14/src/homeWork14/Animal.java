package homeWork14;

public class Animal {
	private String name;
	private int wight;

	public Animal(String name, int wight) {
		super();
		this.name = name;
		this.wight = wight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWight() {
		return wight;
	}

	public void setWight(int wight) {
		this.wight = wight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", wight=" + wight + "]";
	}

}
