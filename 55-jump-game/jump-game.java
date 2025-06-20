class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxLength = 0;

        for(int i = 0; i < n; i++){
            if(i > maxLength) return false;
            maxLength = Math.max(maxLength, i + nums[i]);
        }
        return true;
    }
}

 