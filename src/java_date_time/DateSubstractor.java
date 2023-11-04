package src.java_date_time;

import java.time.LocalDate;

public class DateSubstractor {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023,11,3);
        LocalDate newDate = date.minusYears(8);
        System.out.println(newDate);
    }
}
