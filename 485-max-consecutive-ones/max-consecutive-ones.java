class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;

        int count = 0;
        int consecutive  = 0;
        for(int num : nums){
            if(num == 1){
                count++;
            }else{
            if(consecutive < count){
            consecutive  = count;
            }
            count = 0;
            }
        }
            if (consecutive < count) {
            consecutive = count;
        }

        return consecutive;
    }
}