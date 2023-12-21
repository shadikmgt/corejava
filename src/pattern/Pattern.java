package src.pattern;

public class Pattern {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(3);
        pattern3(4);
    }
    static void pattern1(int num){
        for (int row = 1; row <= num; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int num){
        for (int row = 1; row <= num; row++){
            for (int col = 1; col <= num; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int num){
        for (int row = 0; row <= num; row++){
            for (int col = 0; col <= num - row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
