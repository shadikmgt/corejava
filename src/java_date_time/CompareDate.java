package src.java_date_time;

import java.time.LocalDate;

public class CompareDate {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 11, 3);
        LocalDate date2 = LocalDate.of(2023, 11, 10);

        int result = date1.compareTo(date2);

        if (result == 0){
            System.out.println("The dates are equals.");
        } else if (result > 0) {
            System.out.println("Date1 is greater.");
        }else {
            System.out.println("Date2 is less than date1.");
        }

    }
}
