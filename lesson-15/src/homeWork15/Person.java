package homeWork15;

public class Person implements Comparable<Person> {
	private String nameOfPerson;
	private int ageOfPerson;

	public Person(String nameOfPerson, int ageOfPerson) {
		super();
		this.nameOfPerson = nameOfPerson;
		this.ageOfPerson = ageOfPerson;
	}

	public String getNameOfPerson() {
		return nameOfPerson;
	}

	public void setNameOfPerson(String nameOfPerson) {
		this.nameOfPerson = nameOfPerson;
	}

	public int getAgeOfPerson() {
		return ageOfPerson;
	}

	public void setAgeOfPerson(int ageOfPerson) {
		this.ageOfPerson = ageOfPerson;
	}

	@Override
	public String toString() {
		return "Person [nameOfPerson=" + nameOfPerson + ", ageOfPerson=" + ageOfPerson + "]";
	}

	@Override
	public int compareTo(Person o) {

		return this.getNameOfPerson().equalsIgnoreCase(o.getNameOfPerson()) ? 1 : -1;
	}

}
