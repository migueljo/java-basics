package learningjavabook.chapter8;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate d0 = LocalDate.of(2019, 11, 23);
		System.out.println(d0);
		LocalDate d1 = LocalDate.parse("2019-11-24");
		System.out.println(d1);
		LocalTime t1 = LocalTime.of(23,59);
		System.out.println(t1);
		LocalTime t2 = LocalTime.parse("23:58");
		System.out.println(t2);
	}
}
