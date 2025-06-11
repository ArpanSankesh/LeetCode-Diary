class Solution {
    public boolean isPowerOfTwo(int n) {
        
        for(int i = 0; i <= n; i++){
            double pow = Math.pow(2,i);
            if (pow == n) return true;
            if (pow > n ) break;
        }
        return false;
    }
}