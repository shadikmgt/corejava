package src.leetcode;

public class IsPlaindrome {
    public static void main(String [] args){
        IsPlaindrome plaindrome = new IsPlaindrome();
        int testVal = 121;
        System.out.println(plaindrome.isPlaindrome(testVal));
    }
    public boolean isPlaindrome(int x){
        if ( x < 0 || ( x % 10 == 0 && x != 0 )) {
            return false;
        }

        int y = 0;
        while ( x > y){
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return x == y || y / 10 == x;
    }
}
