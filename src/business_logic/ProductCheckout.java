package src.business_logic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductCheckout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0;
        boolean finished = false;

        while (!finished) {
            System.out.println("Enter product price (or 0 to finished) : ");
            double price = scanner.nextDouble();
            if (price == 0) {
                finished = true;
            } else {
                totalPrice += price;
            }
            double vat = totalPrice * 0.15;
            double finalPrice = totalPrice + vat;

            System.out.println("Total price : " + totalPrice);
            System.out.println("Total vat : " + vat);
            System.out.println("Final price : " + finalPrice);
            System.out.println("Enter the amount of you paid : ");
            double moneyPaid = scanner.nextDouble();

            DecimalFormat format = new DecimalFormat("#.##");
            if (moneyPaid > finalPrice){
                double returnMoney = moneyPaid - finalPrice;
                System.out.println("Return money is : " + format.format(returnMoney));
            } else {
                double outstandingAmount = finalPrice - moneyPaid;
                System.out.println("Outstanding amount is : "
                        + format.format(outstandingAmount)
                );
            }
        }
    }
}
