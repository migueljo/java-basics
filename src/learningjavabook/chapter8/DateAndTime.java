package learningjavabook.chapter8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
		basicDateAndTimes();
		comparingAndManipulating();
		timeZones();
		dateTimeFormatter();
	}

	static void dateTimeFormatter() {
		System.out.println("------------------------------");
		System.out.println("Date time formatter");
		DateTimeFormatter shortUS = DateTimeFormatter.ofPattern("MM/dd/yy");
		LocalDate valentines = LocalDate.parse("02/14/19", shortUS);
		System.out.println(valentines);

		LocalDate piDay = LocalDate.parse("03/14/19", shortUS);
		System.out.println(piDay);

		LocalDate today = LocalDate.of(2023, 12, 23);
		System.out.println(shortUS.format(today));
	}

	static void timeZones() {
		System.out.println("------------------------------");
		System.out.println("Time zones");
		LocalDateTime dt0 = LocalDateTime.now();
		ZonedDateTime zdt0 = ZonedDateTime.now();
		System.out.println("Local date time:" + dt0 + ", Zoned date time: " + zdt0);
		System.out.println(ZoneId.getAvailableZoneIds());
		ZonedDateTime bogotaTime = ZonedDateTime.now();
		ZonedDateTime tasmaniaTime = dt0.atZone(ZoneId.of("Australia/Tasmania"));
		System.out.println("Local date time:" + dt0 + ", Australia/Tasmania date time: " + tasmaniaTime);
		System.out.println(bogotaTime.withZoneSameInstant(ZoneId.of("Australia/Tasmania")));
	}

	static void comparingAndManipulating() {
		LocalDateTime dt0 = LocalDateTime.parse("2000-01-01T00:00");
		LocalDateTime dt1 = LocalDateTime.now();

		System.out.println("Seconds: " + ChronoUnit.SECONDS.between(dt0, dt1));
		System.out.println("Days: " + ChronoUnit.DAYS.between(dt0, dt1));
		System.out.println("Years: " + ChronoUnit.YEARS.between(dt0, dt1));

		LocalDate today = LocalDate.now();
		LocalDate reminder = today.plusWeeks(1);
		System.out.println("Today: " + today + ", Next reminder: " + reminder);
		LocalDateTime betterReminder = reminder.atTime(LocalTime.of(9, 0));
		System.out.println("Better reminder: " + betterReminder);
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
