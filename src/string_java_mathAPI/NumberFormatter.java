package string_java_mathAPI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumberFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your number: ");
        double number = sc.nextDouble();

        System.out.print("Input your digits: ");
        int digits = sc.nextInt();

//        StringBuilder patternBuilder = new StringBuilder("#.");
//
//        for (int i = 0; i < digits; i++){
//            patternBuilder.append("0");
//        }
//        String pattern = patternBuilder.toString();
//        DecimalFormat df = new DecimalFormat(pattern);
//        String formatedNumber = df.format(number);
//        System.out.println(formatedNumber);

        DecimalFormat df = new DecimalFormat("#." + "#".repeat(digits));
        String formattedNumber = df.format(number);
        System.out.println(formattedNumber);
    }
}
