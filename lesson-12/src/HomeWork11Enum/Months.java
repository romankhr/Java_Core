package HomeWork11Enum;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class MonthArrayList{
	private String month;
	private String season;
	private int days;
	
public MonthArrayList(String month, String season, int days) {

		this.month = month;
		this.season = season;
		this.days = days;
	}
public MonthArrayList() {

}

public String getMonth() {
	return month;
}

public void setMonth(String month) {
	this.month = month;
}

public String getSeason() {
	return season;
}

public void setSeason(String season) {
	this.season = season;
}

public int getDays() {
	return days;
}

public void setDays(int days) {
	this.days = days;
}

@Override
public String toString() {
	return "MonthArrayList [month=" + month + ", season=" + season + ", days=" + days + "]";
}

}
	
public class Months {

	public static void main(String[] args) {
		
		MonthArrayList monthTemp = new MonthArrayList();
		
		ArrayList month = new ArrayList();
		
		month.add(new MonthArrayList("JANUARY", "WINTER", 31));
		month.add(new MonthArrayList("FEBRUARY", "WINTER", 28));
		month.add(new MonthArrayList("MARCH", "SPRING", 31));
		month.add(new MonthArrayList("APRIL", "SPRING", 30));
		month.add(new MonthArrayList("MAY", "SPRING", 31));
		month.add(new MonthArrayList("JUNE", "SUMMER", 30));
		month.add(new MonthArrayList("JULY", "SUMMER", 31));
		month.add(new MonthArrayList("AUGUST", "SUMMER", 31));
		month.add(new MonthArrayList("SEPTEMBER", "FALL", 30));
		month.add(new MonthArrayList("OCTOBER", "FALL", 31));
		month.add(new MonthArrayList("NOVEMBER", "FALL", 30));
		month.add(new MonthArrayList("DECEMBER", "WINTER", 31));
		
		System.out.println(month);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Month ");
		String monthInput = scanner.next().toUpperCase();
		boolean flag = false;
				
		
		for (int i=0;i<month.size();i++) {
			monthTemp = (MonthArrayList) month.get(i);
			String mm = monthTemp.getMonth();
			if (mm.equalsIgnoreCase(monthInput)) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println(" Μ³ρÿφό " + monthInput + " ³ρνσΊ");
		} else {
			System.out.println(" Μ³ρÿφό " + monthInput + " ΝΕ ³ρνσΊ");
		}

		System.out.println("Input Season ");
		String seasonInput = scanner.next().toUpperCase();
		for (int i=0;i<month.size();i++) {
			monthTemp = (MonthArrayList) month.get(i);
			String mm = monthTemp.getSeason();
			if (mm.equals(seasonInput)) {
				System.out.println("In " + seasonInput + " there is " + monthTemp.getMonth());
			}
		}

		System.out.println("Input Days ");
		int dayInput = scanner.nextInt();
		for (int i=0;i<month.size();i++) {
			monthTemp = (MonthArrayList) month.get(i);
			int mm = monthTemp.getDays();
			if (mm == dayInput) {
				System.out.println(dayInput + " days has " + monthTemp.getMonth());
			}
		}
		
		System.out.println("Input MAX Days ");
		int dayMaxInput = scanner.nextInt();
		for (int i=0;i<month.size();i++) {
		monthTemp = (MonthArrayList) month.get(i);
		int mm = monthTemp.getDays();
		if (mm < dayInput) {
			System.out.println("Less than " +dayInput + " days has " + monthTemp.getMonth());
		}
	}
		System.out.println("Input MAX Days ");
		dayMaxInput = scanner.nextInt();
		for (int i=0;i<month.size();i++) {
		monthTemp = (MonthArrayList) month.get(i);
		int mm = monthTemp.getDays();
		if (mm > dayInput) {
			System.out.println("More than " +dayInput + " days has " + monthTemp.getMonth());
		}
	}
		
		
		
}
}