class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int runningSum = 0;

        while (start < nums.length) {
            runningSum += nums[start];
            while (runningSum >= target) {
                minLength = Math.min(minLength, start - end + 1);
                runningSum -= nums[end];
                end++;
            }
            start++;
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}