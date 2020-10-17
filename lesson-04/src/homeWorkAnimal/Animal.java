package homeWorkAnimal;

public class Animal {
	private String name;
	private int age;
	private int velocity;
	public Animal(String name, int age, int velocity) {
		this.name = name;
		this.age = age;
		this.velocity = velocity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", velocity=" + velocity + "]";
	}
	
}
