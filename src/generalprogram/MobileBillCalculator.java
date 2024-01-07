package src.generalprogram;

import java.util.Scanner;

public class MobileBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double MONTHLY_FEE = 125.0;
        final double MONTHLY_BILL_BETWEEN_501_1000 = 0.25;
        final double MONTHLY_BILL_ABOVE_1001 = 0.49;


        System.out.println("Enter total call duration in minutes : ");
        int minutes = sc.nextInt();
        double bill;

        if (minutes <= 500){
            bill = MONTHLY_FEE;
        } else if (minutes <= 1000) {
            bill = MONTHLY_FEE
                    + ((minutes - 500) * MONTHLY_BILL_BETWEEN_501_1000);
        }
        else {
            bill = MONTHLY_FEE
                    + 500 * MONTHLY_BILL_BETWEEN_501_1000
                    + (minutes - 1000) * MONTHLY_BILL_ABOVE_1001;
        }
        System.out.println("Your monthly bill is : " + bill + " Tk");
    }
}
