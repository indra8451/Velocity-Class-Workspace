package Date_and_Time_Changes_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AfterJava_8 {

	public static void main(String[] args) {

		// Getting the current time
		LocalTime lt = LocalTime.now();
		System.out.println("Current Time: " + lt); // Output example: 11:20:50.123 (HH:mm:ss.milliseconds)

		// Getting the current date
		LocalDate ld = LocalDate.now();
		System.out.println("Current Date: " + ld); // Output example: 2024-10-31

		// Getting only the year from the current date
		int year = ld.getYear();
		System.out.println("Current Year: " + year); // Output: 2024

		// Getting only the day from the current date
		int day = ld.getDayOfMonth();
		System.out.println("Current Day of the Month: " + day); // Output: Day of the month (1-31)

		// You can also get the day of the week
		String dayOfWeek = ld.getDayOfWeek().toString();
		System.out.println("Current Day of the Week: " + dayOfWeek); // Output: e.g., THURSDAY

		// Getting both current date and time
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Current Date and Time: " + ldt); // Output example: 2024-10-31T11:20:50.123

	}
}
