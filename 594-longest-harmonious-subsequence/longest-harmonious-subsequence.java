class Solution {
    public int findLHS(int[] nums) {
        int longestHarmSeq = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            boolean hasDiff = false;
            for(int j = 0 ; j < n; j++){
                if(nums[j] == nums[i]){
                    count++;
                } else if(nums[j] == nums[i] + 1){
                    count++;
                    hasDiff = true;
                }
            }
            if(hasDiff){
            longestHarmSeq = Math.max(longestHarmSeq, count);
            }
        }
        return longestHarmSeq;
    }
}