class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;

        for(int i = 0; i < n; i++){
            if(i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= nums.length - 1) return true; // early exit
        }
        return true;
    }
}

 