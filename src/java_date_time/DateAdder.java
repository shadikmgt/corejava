package src.java_date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAdder {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String patternDate = date.format(formatter);
        System.out.println(patternDate);


    }
}
