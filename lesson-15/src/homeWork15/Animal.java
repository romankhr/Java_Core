package homeWork15;

public class Animal {
	private String typeOfAnimal;
	private String nameOfAnimal;
	public Animal(String typeOfAnimal, String nameOfAnimal) {
		super();
		this.typeOfAnimal = typeOfAnimal;
		this.nameOfAnimal = nameOfAnimal;
	}
	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}
	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}
	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}
	@Override
	public String toString() {
		return "Animal [typeOfAnimal=" + typeOfAnimal + ", nameOfAnimal=" + nameOfAnimal + "]";
	}
	
	
	
}
