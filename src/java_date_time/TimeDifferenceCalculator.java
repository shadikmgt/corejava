package src.java_date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeDifferenceCalculator {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.of(2023, 11,3,0,0,0);
        LocalDateTime date2 = LocalDateTime.of(2023,11,4,0,0,0);

        Duration duration = Duration.between(date1,date2);
        long seconds = duration.getSeconds();
        System.out.println(seconds);
    }
}
