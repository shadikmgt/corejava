package src.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String romanNum = "CV";
        System.out.println(romanToInteger.romanToInt(romanNum));

    }
    public int romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++){
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))){
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            }
            else {
                result += map.get(s.charAt(i));
            }

        }
        return result;
    }
}

//public class Main {
//    public static int romanToInt(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//
//        int result = 0;
//        int prevValue = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int currValue = map.get(s.charAt(i));
//            if (i > 0 && currValue > prevValue) {
//                result += currValue - 2 * prevValue;
//            } else {
//                result += currValue;
//            }
//            prevValue = currValue;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        String input = "MCMXCIV";
//        System.out.println("Output: " + romanToInt(input)); // Output: 1994
//    }
//}