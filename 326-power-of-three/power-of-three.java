class Solution {
    public boolean isPowerOfThree(int n) {

        // return n > 0 && 1162261467 % n == 0;

        // if(n<=0) return false;
        // if(n == 1) return true;
        // if(n % 3 != 0) return false;
        // return isPowerOfThree(n/3);

        if(n <= 0 ) return false;
        while(n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }
}