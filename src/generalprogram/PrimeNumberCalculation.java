package src.generalprogram;

import java.util.Scanner;

public class PrimeNumberCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        if (isPrime(n)){
            System.out.println( n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
//        int i;
//        int m;
//        int flag = 0;
//
//        int n = 2;
//        m = n / 2;
//
//        if(n == 0 || n == 1){
//            System.out.println(n + " is not a prime number.");
//        } else {
//            for ( i = 2; i <= m; i++){
//                if (m % i == 0){
//                    System.out.println(n + " number is not a prime");
//                    flag = 1;
//                    break;
//                }
//            }
//        }
//        if (flag == 0){
//            System.out.println(n + " is a prime number.");
//        }


    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
