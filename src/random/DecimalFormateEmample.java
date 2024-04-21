package src.random;

import java.text.DecimalFormat;

public class DecimalFormateEmample {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.##Tk");
        double amount = 12350.6453350545;
        String formattedAmount = decimalFormat.format(amount);
        System.out.println(formattedAmount);
    }
}
