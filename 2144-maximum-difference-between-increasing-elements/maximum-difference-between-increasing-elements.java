class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int res = -1;
        int min = nums[0];
        for(int j = 1; j < n; j++){
                if(nums[j] > min){
                    res = Math.max(res, nums[j] - min);
                }   
                min = Math.min(min, nums[j]);
        }
        return res;
    }
}