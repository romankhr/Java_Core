package homeWork21;

public class Animal {
	@MyAnnotation(params="Animal Name")
	private String name;
	@MyAnnotation(params="Animal Type")
	private String type;
	@MyAnnotation(params="Animal Age")
	private int age;
	public Animal(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	
}
