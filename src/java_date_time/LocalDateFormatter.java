package src.java_date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateFormatter {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 4);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String str = date.format(formatter);
        System.out.println(str);
    }
}
