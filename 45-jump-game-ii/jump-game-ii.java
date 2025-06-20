class Solution {
    public int jump(int[] nums) {
        int maxReach = 0;
        int steps = 0;
        int currentEnd = 0;
        for(int i = 0; i< nums.length - 1 ; i++){
            
            maxReach = Math.max(maxReach, i + nums[i]);
              if (i == currentEnd) {
                steps++;
                currentEnd = maxReach;
            }
        }
        return steps;
    }
}