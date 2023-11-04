package src.java_date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekRetriver {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023,11,4);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
