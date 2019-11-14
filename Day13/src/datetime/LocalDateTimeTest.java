package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		LocalDateTimeTest test = new LocalDateTimeTest();
		test.testLocalDateTime();
		

	}

	private void testLocalDateTime() {
		//Get the current date and time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + currentTime);
		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("Date: " + date1);
		String month = currentTime.getMonth().toString().toLowerCase();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();
		System.out.println("Month: " + month + " Day: " + day + " Seconds: " + seconds);
		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2018);
		System.out.println("Second Date: " + date2);
		LocalDate date3 = date1.plus(Period.ofDays(4));
		System.out.println("Four days from now: " + date3);
		//Including Time Zones 
		ZonedDateTime zoneDate = ZonedDateTime.parse("2018-12-28T10:15:30+05:30[Asia/Kolkata]");
		System.out.println("Time Zone Specified: " + zoneDate);
		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + id);
		ZonedDateTime parisTime = 
				zoneDate.toInstant().atZone(id);
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("Current Time Zone: " + currentZone);
	}

}
