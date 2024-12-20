package Date_and_Time_Changes_API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BeforeJava_8 {

    public static void main(String[] args) {

        Date date = new Date();

        // Print full date and time in default format
        System.out.println(date); // Example output: Thu Oct 31 11:20:50 IST 2024

        // Example of getting time in milliseconds since January 1, 1970 (Epoch time)
        System.out.println(date.getTime()); // Example output: 1730353923348 (milliseconds)

        // Getting the year using getYear() - it returns the year offset by 1900
        System.out.println(date.getYear()); // Output: 124 (represents 2024 as 124 years after 1900)

        // Getting only the minute using getMinutes() (Deprecated in newer Java versions)
        System.out.println(date.getMinutes()); // Example output: 20 (current minute)

        System.out.println("##################### Converting milliseconds into readable time format ######################");

        // Converting milliseconds into a proper time format using SimpleDateFormat
        long timestamp = date.getTime();
        Date date1 = new Date(timestamp);

        // Formatting to display time only (HH:mm:ss format)
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = timeFormat.format(date1);
        System.out.println("Converted Time: " + formattedTime); // Output: HH:mm:ss format of current time

        System.out.println("##################### Converting year offset to proper year ######################");

        // First way: Converting offset year to a correct year by adding 1900
        int year = date1.getYear() + 1900;
        System.out.println("Converted Year (First way): " + year); // Correct output: 2024

        // Second way: Using SimpleDateFormat to display the full year directly
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String formattedYear = yearFormat.format(date1);
        System.out.println("Converted Year (Second way): " + formattedYear); // Correct output: 2024
    }
}
