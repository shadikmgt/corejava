package src.generalprogram;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        int value = 1;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = value ;
                value++;
            }
            System.out.println();
        }
        System.out.println("The 2D array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
