package src.generalprogram;

public class PrimeNumberCalculation {
    public static void main(String[] args) {
        int i;
        int m;
        int flag = 0;

        int n = 2;
        m = n / 2;

        if(n == 0 || n == 1){
            System.out.println(n + " is not a prime number.");
        } else {
            for ( i = 2; i <= m; i++){
                if (m % i == 0){
                    System.out.println(n + " number is not a prime");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0){
            System.out.println(n + " is a prime number.");
        }
    }
}
