package homeWorkSelary;

public class HourlyPayment implements Salary  {

	@Override
	public void payment(int days) {
	double salary=days* 8*9.30;
	System.out.println("Your salary is " + Math.round(100*salary)/100.0+ " for "+ days +" days with hourly rate of 9.30");
		
	}

}
