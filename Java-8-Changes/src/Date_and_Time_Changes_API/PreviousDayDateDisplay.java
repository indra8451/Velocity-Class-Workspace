package Date_and_Time_Changes_API;

import java.time.LocalDate;

public class PreviousDayDateDisplay {

    public static void main(String[] args) {

        // Get the current date using LocalDate.now()
        LocalDate todayDate = LocalDate.now();
        
        // Print today's date to the console
        System.out.println("Today's Date: " + todayDate);
        
        // Calculate the previous day's date by subtracting one day from today's date
        LocalDate previousDay = todayDate.minusDays(1);
        
        // Print the previous day's date to the console
        System.out.println("Previous Day's Date: " + previousDay);
    }
}
	