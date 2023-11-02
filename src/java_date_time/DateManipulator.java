package src.java_date_time;

import java.time.LocalDate;

public class DateManipulator {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11,3);

        LocalDate newDate = date.plusDays(17);
        System.out.println(newDate);
    }

}
