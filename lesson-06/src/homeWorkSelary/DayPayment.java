package homeWorkSelary;

public class DayPayment implements Salary {

	@Override
	public void payment(int days) {
		double salary=days* 90.50;
		System.out.println("Your salary is " + salary+ " for "+ days +" days with days rate of 90.50");
			
		}
		
	}


