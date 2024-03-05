package src.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        int[] arr = {3,6,2,9,5};
        int t = 7;

        System.out.println(Arrays.toString(twoSum.twoSum(arr,t)));

    }
//    public int [] twoSum(int[] nums, int target ){
//        for (int i = 0; i < nums.length; i++){
//            for (int j = i + 1; j < nums.length; j++){
//                if (nums[i] + nums[j] == target){
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return nums;
//    }
    public int[] twoSum(int[] nums, int target){
        Map <Integer, Integer> restNum = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Integer restNumIndex = restNum.get(nums[i]);
            if (restNumIndex != null){
                return new int[] {i, restNumIndex};
            }
            restNum.put(target - nums[i], i);
        }
        return nums;
    }
}
