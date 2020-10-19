package homeWorkSelary;

public class ApplicationSalary {

	public static void main(String[] args) {
		Salary ivanSalary=new HourlyPayment();
		ivanSalary.payment(22);
		
		Salary petroSalary = new DayPayment();
		petroSalary.payment(22);
	}

}
