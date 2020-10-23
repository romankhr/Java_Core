package homeWork9;

import java.util.Scanner;

/**
 * 
 * @author Roman
 * @version 1.1
 * @see Scanner
 * 
 * */
/* enum Seasons*/
enum Seasons {
	WINTER, SPRING, SUMMER, FALL
}

/* enum months with days*/
enum Months {
	JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
	MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31),
	SEPTEMBER(Seasons.FALL, 30), OCTOBER(Seasons.FALL, 31), NOVEMBER(Seasons.FALL, 30), DECEMBER(Seasons.WINTER, 31);
	Seasons seasons;
	int days;
	/* the constructor for enum Month*/
	Months(Seasons seasons, int days) {
		this.seasons = seasons;
		this.days = days;
	}

	public Seasons getSeasons() {
		return seasons;
	}

	public void setSeasons(Seasons seasons) {
		this.seasons = seasons;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	/* main programm*/
	public static void main(String[] args) {
		
		/* input data*/
		Months[] months = Months.values();
		System.out.println(months[1]);
		System.out.println(months[1].ordinal());
		Seasons[] seasons=Seasons.values();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Month ");
		String monthInput = scanner.next().toUpperCase();
				
		boolean flag = false;
		for (Months m : months) {
			if (m.name().equals(monthInput)) {
				flag = true;
			}
		}
		/* try-catch exception*/
		try {
			if (flag) {
				System.out.println(" Μ³ρÿφό " + monthInput + "  ³ρνσΊ");
			}else {
				throw new Exception(" Μ³ρÿφό " + monthInput + " ΝΕ ³ρνσΊ");
			}
		
		}catch(Exception e) {
			System.err.println(" Μ³ρÿφό " + monthInput + " νε ³ρνσΊ");
		} finally {
			System.out.println("Continue input the other data!");
		}
		
		System.out.println("Input Season ");
		String seasonInput = scanner.next().toUpperCase();
		for (Months m : months) {
			if (m.getSeasons().name().equals(seasonInput)) {
				System.out.println("In " + seasonInput + " there is " + m.name());
			}
		}

		System.out.println("Input Days ");
		int dayInput = scanner.nextInt();
		for (Months m : months) {
			if (m.getDays() == dayInput) {
				System.out.println(dayInput + " days has " + m.name());
			}
		}
		/* calculation min/max days in months*/
		System.out.println("Input MAX Days ");
		int dayMaxInput = scanner.nextInt();
		for (Months m : months) {
			if (m.getDays() < dayMaxInput) {
				System.out.println("Less than "+ dayMaxInput + " days has " + m.name());
			}
		}
		
		System.out.println("Input Min Days ");
		int dayMinInput = scanner.nextInt();
		for (Months m : months) {
			if (m.getDays() > dayMinInput) {
				System.out.println("More than "+ dayMinInput + " days has " + m.name());
			}
		}
		System.out.println("-------------");
		System.out.println("Input Season ");
		int seasonNumber=0;
		int seasonNumber1=0;
		boolean seasonExist=false;
		String seasonNextInput = scanner.next().toUpperCase();
			for (Seasons s : seasons) {
			if(s.name().equals(seasonNextInput)) {
				seasonNumber=s.ordinal();
				seasonExist=true;
				}
		}
			seasonNumber1=seasonNumber;
			if (seasonNumber==3) {seasonNumber=-1;}
		if (seasonExist) {
			System.out.println(" The next season is " +seasons[seasonNumber+1] );
		}else{
			System.out.println("There is no such season");
		}
		if (seasonNumber1==0) {seasonNumber1=4;}
		if (seasonExist) {
			System.out.println(" The previous season is " +seasons[seasonNumber1-1] );
	}
		System.out.println("-------------");
		for (Months m : months) {
			if (m.getDays() %2==0) {
				System.out.println("The EVEN months is " + m.name());
			}
		}
		System.out.println("-------------");
		for (Months m : months) {
			if (m.getDays() %2!=0) {
				System.out.println("The ODD months is " + m.name());
			}
		}
		
		System.out.println("Input Month ");
		String month1Input = scanner.next().toUpperCase();
		int monthODD = 0;
		for (Months m : months) {
			if (m.name().equals(month1Input)) {monthODD=m.ordinal();}
			
		}
		if (months[monthODD].getDays() %2!=0) {
			System.out.println("The ODD month ");
		}else {
			System.out.println("The EVEN month");
		}
}
}