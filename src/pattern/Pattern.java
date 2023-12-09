package src.pattern;

public class Pattern {
    public static void main(String[] args) {
        pattern1(10);
    }
    static void pattern1(int num){
        for (int row = 1; row <= num; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
