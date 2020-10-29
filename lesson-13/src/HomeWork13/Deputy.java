package HomeWork13;

public class Deputy extends Human {
	private String firstName;
	private String lastName;
	private int age;
	private boolean bribe = false;
	private int quantityOfBribe = 0;
	private String fraction = "Free";
	public Deputy() {
		
	};
	
	public Deputy(int weight, int heigth, String firstName, String lastName, int age, boolean bribe, String fraction, int quantityOfBribe) {
		super(weight, heigth);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.bribe = bribe;
		this.fraction=fraction;
		this.quantityOfBribe = quantityOfBribe;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFraction() {
		return fraction;
	}

	public void setFraction(String fraction) {
		this.fraction = fraction;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribe() {
		return bribe;
	}

	public void setBribe(boolean bribe) {
		this.bribe = bribe;
	}

	public int getQuantityOfBribe() {
		return quantityOfBribe;
	}

	public void setQuantityOfBribe(int quantityOfBribe) {
		this.quantityOfBribe = quantityOfBribe;
	}

		
	
	@Override
	public String toString() {
		return "Deputy [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", bribe=" + bribe
				+ ", quantityOfBribe=" + quantityOfBribe + ", fraction=" + fraction + "]";
	}

	public void giveBribe(boolean bribe, int sum) {
		if(!bribe) {
			System.out.println("Цей депутат не бере хабарі!");
		}else if (sum>5000) {
			System.out.println("Поліція увязнить депутата"+firstName +" " + lastName );
		}else {
			this.quantityOfBribe=sum;
		}
	}
}
