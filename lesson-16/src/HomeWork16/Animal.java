package HomeWork16;

public class Animal {
	private String name;
	public String typeOfAnimal;
	private int age;
	public int weight;
	
	public Animal(String name, String typeOfAnimal, int age, int weight) {
		super();
		this.name = name;
		this.typeOfAnimal = typeOfAnimal;
		this.age = age;
		this.weight = weight;
	}
	public Animal(String name, String typeOfAnimal) {
		super();
		this.name = name;
		this.typeOfAnimal = typeOfAnimal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}
	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", typeOfAnimal=" + typeOfAnimal + ", age=" + age + ", weight=" + weight + "]";
	}
	
	public void myMethod(String str, int age) {
		System.out.println("\nYou have called methods myMethods from Reflaction with "+ str+" and "+age+" parameters!");
	}
	
	public void myMethod(String str) {
		System.out.println("\nYou have called methods myMethods from Reflaction with "+ str+" parameter!");
	}
	
}
