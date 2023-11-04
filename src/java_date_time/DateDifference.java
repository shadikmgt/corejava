package src.java_date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

import static java.util.concurrent.TimeUnit.DAYS;

public class DateDifference {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023,11,3);
        LocalDate date2 = LocalDate.of(2024, Month.JANUARY, 21);
//        var days = Duration.between(date1, date2).toDays();
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(daysBetween);
    }
}
