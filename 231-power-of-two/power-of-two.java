class Solution {
    public boolean isPowerOfTwo(int n) {
        
        for(int i = 0; i <= 30; i++){
            double pow = Math.pow(2,i);
            if (pow == n) return true;
            if (pow > n ) break;
        }
        return false;
    }
}