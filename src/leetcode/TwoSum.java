package src.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        int[] arr = {3,6,2,9,5};
        int t = 7;

        System.out.println(Arrays.toString(twoSum.twoSum(arr,t)));

    }
    public int [] twoSum(int[] nums, int target ){
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return nums;
    }
}
