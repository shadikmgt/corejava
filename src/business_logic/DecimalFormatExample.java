package src.business_logic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalFormatExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Enter amount : ");
        double amount = scanner.nextDouble();
        double charge = (amount * 1.85) / 100;

        double totalAmount = amount + charge;

        String formatterAmount = decimalFormat.format(totalAmount);
        System.out.println("Charge : " + decimalFormat.format(charge));
        System.out.println("Total amount : " +formatterAmount);
    }
}
