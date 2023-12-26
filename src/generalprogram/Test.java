package src.generalprogram;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        checkPrime(4);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPrime(n)){
            System.out.println(n + " is prime number.");
        }else {
            System.out.println(n + " is not a prime number.");
        }

    }

//    static void checkPrime(int num){
//        int m;
//        int flag = 0;
//
//        m = num / 2;
//        if (num == 0 || num == 1){
//            System.out.println(num + " is not prime number.");
//        }else {
//            for (int i = 2; i < m; i++){
//                if (num % i == 0){
//                    System.out.println(num + " is not a prime number.");
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0) {
//                System.out.println(num + " is a prime a number.");
//            }
//        }
//    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++){
            if (num % i == 0){
                return  false;
            }
        }
        return true;
    }
}
