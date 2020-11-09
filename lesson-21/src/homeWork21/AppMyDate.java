package homeWork21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class AppMyDate {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(convertDateLocalDate(d));
		System.out.println(convertDateLocalTime(d));
		System.out.println(convertDateLocalDayTime(d));

	}

	public static LocalDate convertDateLocalDate(Date date) {

		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public static LocalTime convertDateLocalTime(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
	}

	public static LocalDateTime convertDateLocalDayTime(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}
}
