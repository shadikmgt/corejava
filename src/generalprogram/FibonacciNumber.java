package src.generalprogram;

public class FibonacciNumber {
    static int num1 = 0;
    static int num2 = 1;
    static int num3 = 0;

    static void printFibonacci(int count){
        if (count > 0){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3);
            printFibonacci(count - 1);
        }
    }

        public static void main(String[] args) {
//        int i = 0;
//        int num1 = 0;
//        int num2 = 1;
//        int num3;
//        int count = 10;
//
//        System.out.println(num1 + ' ' + num2);
//        for ( i = 2; i <= count; i++){
//            num3 = num1 + num2;
//            System.out.println(num3);
//            num1 = num2;
//            num2 = num3;
//        }
         int count = 10;
            System.out.println(num1 + num2);
            printFibonacci(count -2);





    }
}
