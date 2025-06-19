class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int subsequence = 1;
        int minVal = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] - minVal > k){
            subsequence++;
            minVal = nums[i];
            }
        }
        return subsequence;
    }
}