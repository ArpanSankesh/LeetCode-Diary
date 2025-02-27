class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ){
            return false;
        }
        int val = 0;
        int original = x;

        while( x!=0 ){
            // int digit = x % 10;
            val = val * 10 + ( x % 10);
            x = x / 10 ;
        }
        return val == original;
    }
}