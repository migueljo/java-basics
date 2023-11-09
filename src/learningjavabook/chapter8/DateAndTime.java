package learningjavabook.chapter8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
		basicDateAndTimes();
		comparingAndManipulating();
	}

	static void comparingAndManipulating() {
		LocalDateTime dt0 = LocalDateTime.parse("2000-01-01T00:00");
		LocalDateTime dt1 = LocalDateTime.now();

		System.out.println("Seconds: " + ChronoUnit.SECONDS.between(dt0, dt1));
		System.out.println("Days: " + ChronoUnit.DAYS.between(dt0, dt1));
		System.out.println("Years: " + ChronoUnit.YEARS.between(dt0, dt1));
	}

	static void basicDateAndTimes() {
		LocalDate d0 = LocalDate.of(2019, 11, 23);
		System.out.println(d0);
		LocalDate d1 = LocalDate.parse("2019-11-24");
		System.out.println(d1);
		LocalTime t1 = LocalTime.of(23,59);
		System.out.println(t1);
		LocalTime t2 = LocalTime.parse("23:58");
		System.out.println(t2);
		LocalDateTime dt0 = LocalDateTime.of(2019, 11, 25, 11, 45);
		System.out.println(dt0);
		LocalDateTime dt1 = LocalDateTime.parse("2019-11-26T11:50");
		System.out.println(dt1);
		LocalDateTime dt2 = LocalDateTime.now();
		System.out.println(dt2);
		LocalDate d2 = LocalDate.now();
		System.out.println(d2);
		LocalTime t3 = LocalTime.now();
		System.out.println(t3);
	}
}
