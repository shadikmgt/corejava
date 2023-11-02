package src.java_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("This is current date and time " + now);

        LocalDate currentDate = LocalDate.now();
        System.out.println("This is current date " + currentDate);

       var currentTime = LocalTime.now();
        System.out.println("Showing the current time " + currentTime);
    }
}
