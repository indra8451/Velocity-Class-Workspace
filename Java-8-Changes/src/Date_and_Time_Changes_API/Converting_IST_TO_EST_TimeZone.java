package Date_and_Time_Changes_API;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Converting_IST_TO_EST_TimeZone {
    
    public static void main(String[] args) {
        
        // Get the current date and time in the default time zone
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("Current Date and Time in Default Time Zone: " + zdt);
        
        // Define the zone ID for EST (Eastern Standard Time)
        // You can find zone IDs from various sources, including Google
        ZoneId estTimeZone = ZoneId.of("America/New_York"); // Corrected to use New York for EST
        
        // Convert the current ZonedDateTime to the EST time zone
        ZonedDateTime estZonedDateTime = zdt.withZoneSameInstant(estTimeZone);
        
        // Print the converted time in EST
        System.out.println("Converted Date and Time in EST: " + estZonedDateTime);
    }
}
