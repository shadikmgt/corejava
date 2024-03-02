package src.dataStructureAndAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int arr[] = {2,5,8,3,9,8,11,19,12,14};
        int data = 22;
        linearSearch.linearSearch(arr, data);
    }
    public void linearSearch(int arr[], int data){
        int n = arr.length;
        int i = 0;
        for ( i = 0; i < n; i++){
            if (arr[i] == data){
                System.out.println(data + " is found in the index no " + i);
                break;
            }
        }
        if (i == n ){
            System.out.println("number is not found in the elements.");
        }
    }
}
